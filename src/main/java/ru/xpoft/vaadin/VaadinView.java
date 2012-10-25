package ru.xpoft.vaadin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xpoft
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VaadinView
{
    String value() default "";
    String scope() default VaadinViewScopes.PROTOTYPE;
}
