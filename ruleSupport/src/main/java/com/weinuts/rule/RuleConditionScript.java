package com.weinuts.rule;


import org.apache.commons.lang3.StringUtils;
import org.mvel2.MVEL;
import org.mvel2.ParserContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: ljwang
 * Date: 11/30/15
 * Time: 10:51 AM
 *
 *
 * a sample for condition implement
 */
public class RuleConditionScript implements ICondition{
    private static final Logger LOG = LoggerFactory.getLogger(RuleConditionScript.class);

    private String expression;
    private ParserContext parserContext;

    public static final String RULE_PRE_ERROR_MSG="Expression is Empty";

    public RuleConditionScript() {
        initContext();
    }

    /**
     * init import resource
     */
    private void initContext() {
        parserContext = new ParserContext();
        parserContext.addPackageImport("com.weinuts.domain");
        //To change body of created methods use File | Settings | File Templates.
    }

    @Override
    public boolean condition(Object o) throws Exception {
        preCheck();
        Boolean result = MVEL.eval(expression , o , Boolean.class);
        LOG.info(String.format("Execute: %s result: %s" , this.getExpression() , result));
        return result;
    }

    private void preCheck() throws Exception {
        if(StringUtils.isEmpty(expression)){
            throw new Exception(RULE_PRE_ERROR_MSG);
        }

    }

    public String getExpression() {
        return expression;
    }

    public RuleConditionScript setExpression(String expression) {
        this.expression = expression;
        return this;
    }


}
