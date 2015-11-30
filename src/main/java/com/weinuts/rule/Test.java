package com.weinuts.rule;

import com.weinuts.domain.User;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/30/15
 * Time: 1:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        User u = new User();
        u.setLoginName("loginName");
        u.setLoginPwd("pwd");
        
        RuleContext context = new RuleContext();
        LinkedList<IRule> rules =  new ConvertRuleFromCsv().loadFromCsv();
        context.registerRuleLst(rules);
        context.executeRuleLst(u);
    }
}
