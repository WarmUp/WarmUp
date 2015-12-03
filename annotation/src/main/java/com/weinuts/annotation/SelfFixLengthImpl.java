package com.weinuts.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/24/15
 * Time: 2:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class SelfFixLengthImpl  implements ConstraintValidator<SelfFixLen, String> {
    private int length;
    private static String ATOM = "[a-z0-9]{2}";
    private Pattern pattern = Pattern.compile(ATOM , Pattern.CASE_INSENSITIVE);
    @Override
    public void initialize(SelfFixLen selfFixLen) {
        this.length = selfFixLen.length();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value != null && value.length() != 0 ) {
            if(value.length()==length){
                return true;
            }
            Matcher m = pattern.matcher(value);
            return m.matches();
        }
        return false;
    }
}
