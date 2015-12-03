package com.weinuts.rule;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/30/15
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConvertRuleFromCsv {

    private String ruleCsvPath = "rule.csv";
    public final String COLUMN_EXPRESSION="Expression";
    public final String COLUMN_RULE_NAME="Rule Name";
    public final String COLUMN_GROUP_NAME="Group Name";

    public void initContext(){

    }
    
    
    public LinkedList<IRule> loadFromCsv() throws IOException {
        InputStream ins = this.getClass().getClassLoader().getResourceAsStream(ruleCsvPath);
        InputStreamReader inr = new InputStreamReader(ins);
        CSVParser parser = new CSVParser(inr , CSVFormat.EXCEL.withHeader());
        Iterable<CSVRecord> records = parser.getRecords();

        LinkedList<IRule> lst = new LinkedList<IRule>();
        for (CSVRecord record : records) {
            Rule rule = new Rule();
            RuleConditionScript ruleCondition = new RuleConditionScript();
            //set conditions
            ruleCondition.setExpression(record.get(COLUMN_EXPRESSION));
            rule.setiCondition(ruleCondition);
            rule.setRuleName(record.get(COLUMN_RULE_NAME));
            rule.setRuleGroup(record.get(COLUMN_GROUP_NAME));
            //set action
            RuleActionScript action = new RuleActionScript();
            rule.setiAction(action);
            //add rule
            lst.add(rule);
        }
        return lst;
    }


}
