package com.ocastudy.methods_encapsulation.java_basics;

/**
 * Created by dana on 7/23/14.
 */
class Course {
//    private String courseName;
    String courseName;
}
class EJavaGuru {
    public static void main(String args[]) {
        Course c = new Course();
        c.courseName = "Java";
        System.out.println(c.courseName);
    }
}
/* If the variable courseName is defined as a private member, it won’t be
accessible from the class EJavaGuru . An attempt to do so will cause it to fail at compile
time. */