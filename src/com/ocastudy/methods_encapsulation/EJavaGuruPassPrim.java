package com.ocastudy.methods_encapsulation;

/**
 * Created by dana on 7/23/14.
 */
class EJavaGuruPassPrim {
    public static void main(String args[]) {
        int ejg = 10;
        anotherMethod(ejg);
        System.out.println(ejg);
        someMethod(ejg);
        System.out.println(ejg);
    }
    static void someMethod(int val) {
        ++val;
        System.out.println(val);
    }
    static void anotherMethod(int val) {
        val = 20;
        System.out.println(val);
    }
}
/*When primitive data types are passed to a method, the values of the vari-
        ables in the calling method remain the same. This behavior doesn’t depend on
        whether the primitive values are reassigned other values or modified by addition, sub-
        traction, or multiplication—or any other operation.*/