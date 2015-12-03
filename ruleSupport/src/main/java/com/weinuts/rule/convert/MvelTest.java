package com.weinuts.rule.convert;

import com.weinuts.domain.User;
import org.mvel2.DataConversion;
import org.mvel2.MVEL;
import org.mvel2.ParserContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/27/15
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class MvelTest {
    public static void main(String[] args){
        User u = new User();
        u.setLoginName("loginName");
        u.setLoginPwd("password");


        String expression = "foobar > 199";
        ParserContext context = new ParserContext();

        context.addPackageImport("com.weinuts.domain");

        Map vars = new HashMap();
        vars.put("foobar", "1234");
        Integer len = (Integer) MVEL.eval("loginName.length()", u);
        vars.put("1" , "loginName.length()");
        vars.put("2" , "loginPwd.length()");
        //MVEL.executeExpression(vars , u);
        DataConversion.addConversionHandler(ToType.class , new ToType("error" , "errorDescription"));


        ToType result = MVEL.eval("loginName.length()>9" , u , ToType.class);

        String s = (String) MVEL.eval("if(loginName.length()>2){return loginName+'1111'} ", u);


        System.out.println("---------" + result.getError() + " " + result.getResult()+" "+result.getErrorDescription());
        System.out.println("-----s----" + s);
    }
}
