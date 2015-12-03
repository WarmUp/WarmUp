package com.weinuts.rule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/30/15
 * Time: 10:32 AM
 *
 * rule content
 */
public class RuleContext {
    private static final Logger LOG = LoggerFactory.getLogger(RuleContext.class);

    private boolean NOT_FIT_GOON = Boolean.TRUE;

    private LinkedList<IRule> ruleLst;

    public void registerRule(IRule rule){
        getRuleLst().add(rule);
    }

    public void registerRuleLst(LinkedList<IRule> lst){
        getRuleLst().addAll(lst);
    }

    public void executeRuleLst(Object o) throws Exception {
         for(IRule rule : ruleLst){
             LOG.info(rule.toString());
             if(rule.condition(o)){
                 LOG.info("Fix Condition Execute");
                 rule.action(); 
             }else{
                 LOG.info("Not Fix Condition , Do nothing");
             }
         }
    }

    public LinkedList<IRule> getRuleLst() {
        if(ruleLst==null || ruleLst.size() == 0){
            ruleLst = new LinkedList<IRule>();
        }
        return ruleLst;
    }


}
