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
 * Time: 2:46 PM
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SelfFixLengthImpl.class)
public @interface SelfFixLen {
    int length();
    String message() default "{fixlength.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
