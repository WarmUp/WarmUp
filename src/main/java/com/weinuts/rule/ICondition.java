package com.weinuts.rule;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/30/15
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ICondition {
    public boolean condition(Object o) throws Exception;
}
