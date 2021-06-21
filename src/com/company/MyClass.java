package com.company;

import java.lang.reflect.Method;

public class MyClass {
    @MyCustomAnnotation(value=10)
    public void sayHello(){
        System.out.println("my  custom annotation");
    }

    /**how to  identifie the Annotation of a method
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        MyClass h = new MyClass();
        Method methodVal = h.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is: "+ myCustomAnnotation.value());
    }
}
