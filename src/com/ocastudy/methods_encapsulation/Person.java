package com.ocastudy.methods_encapsulation;

/**
 * Created by dana on 7/23/14.
 */
public class Person {
    public String name;
    public int height;
}

class EJavaGuruPassObjects1 {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "EJava";
        anotherMethod(p);
        System.out.println(p.name);
        someMethod(p);
        System.out.println(p.name);
    }
    static void someMethod(Person p) {
        p.name = "someMethod";
        System.out.println(p.name);
    }
    static void anotherMethod(Person p) {
        p = new Person();
        p.name = "anotherMethod";
        System.out.println(p.name);
    }
}

/*The class EJavaGuruPassObject1 defines two methods, someMethod and
anotherMethod . The method someMethod modifies the value of the object parameter
passed to it. Hence, the changes are visible within this method and in the calling
method (method main ). But the method anotherMethod reassigns the reference vari-
able passed to it. Changes to any of the values of this object are limited to this method.
They aren’t reflected in the calling method (the main method).*/