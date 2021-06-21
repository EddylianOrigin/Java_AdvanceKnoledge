package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**das ist wie wir Annotation deklarieren koennen
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation{
    int value();
}