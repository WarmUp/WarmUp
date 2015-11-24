package com.weinuts.validate.annotation;







import org.apache.commons.beanutils.BeanUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: ljwang
 * Date: 11/24/15
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ValidatorImpl  implements ConstraintValidator<Validator, Object> {
    private String propertyName;
    private String regexExpression;

    private Pattern pattern;  
    
    @Override
    public void initialize(Validator validator) {
        this.propertyName = validator.propertyName();
        this.regexExpression = validator.regexExpression();
        pattern = Pattern.compile(regexExpression , java.util.regex.Pattern.CASE_INSENSITIVE);
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        String fieldValue= null;
        boolean result = false;
        try {
            fieldValue = BeanUtils.getProperty(value, propertyName);
            System.out.println("------------------"+fieldValue);
            System.out.println("------------------"+propertyName);
            System.out.println("------------------"+regexExpression);
            Matcher matcher = pattern.matcher(fieldValue);
            result = matcher.matches();
            System.out.println("------------------"+result);
            /**
             * validate error depend on which propertyName
             */
            String messageTemplate = context.getDefaultConstraintMessageTemplate();
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(messageTemplate)
                    .addNode(propertyName)
                    .addConstraintViolation();

        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InvocationTargetException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchMethodException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }finally {
            return result;
        }

    }
}
