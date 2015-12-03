package com.weinuts.rule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: ljwang
 * Date: 11/30/15
 * Time: 10:49 AM
 *
 * Rule Top Framework
 */
public class Rule implements IRule {
    private static final Logger LOG = LoggerFactory.getLogger(Rule.class);
    /**
     * COMMON PROPERTY
     */
    private String ruleName;
    private String ruleGroup;

    /**
     * Bridge for this Implement
     * condition check can provide by many implement
     * for mvel check and other format check
     */
    private ICondition iCondition;
    /**
     * Bridge for this Implement
     * when condition fix , can do many option implement action for this inter
     */
    private IAction iAction;

    @Override
    public boolean condition(Object o) throws Exception {
        LOG.info(String.format("Rule Name: %s Rule Group: %s" , ruleName , ruleGroup));
        Boolean result = iCondition.condition(o);
        return result;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object action() {
        return iAction.action();  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Rule setiCondition(ICondition iCondition) {
        this.iCondition = iCondition;
        return this;
    }

    public Rule setiAction(IAction iAction) {
        this.iAction = iAction;
        return this;
    }

    public Rule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public Rule setRuleGroup(String ruleGroup) {
        this.ruleGroup = ruleGroup;
        return this;
    }
}
