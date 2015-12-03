package com.weinuts.rule;

/**
 * User: ljwang
 * Date: 11/30/15
 * Time: 10:28 AM
 *
 * rule engine inter
 */
public interface IRule {
    /**
     * condition check
     * maybe mvel expression and so on.
     *
     */
    public boolean condition(Object o) throws Exception;
    /**
     * execute action
     */
    public Object action();

}
