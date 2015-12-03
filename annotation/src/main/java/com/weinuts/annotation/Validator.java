package com.weinuts.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User: ljwang
 * Date: 11/24/15
 * Time: 3:41 PM
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidatorImpl.class)
public @interface Validator {
    String propertyName();
    String regexExpression();

    String message() default "{no.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
