package com.ocastudy.methods_encapsulation;

/**
 * Created by dana on 7/23/14.
 */
class Course {
    void enroll(long duration) {
        System.out.println("long");
    }
    void enroll(int duration) {
        System.out.println("int");
    }
    void enroll(String s) {
        System.out.println("String");
}

    void enroll(Object o) {
        System.out.println("Object");
    }
}

class EJavaGuru {
    public static void main(String args[]) {
        Course course = new Course();
        char c = 10;
        course.enroll(c);
        course.enroll("Object");
    }
}

/*You can overload methods by
changing the type of the method arguments in the list. Using method arguments with
data types having a base-derived class relationship ( Object and String classes) is
acceptable. Using method arguments with data types for which one can be automati-
cally converted to the other ( int and long ) is also acceptable.
When the code executes course.enroll(c) , char can be passed to two overloaded
enroll methods that accept int and long . The char gets expanded to its nearest
type— int —so course.enroll(c) calls the overloaded method that accepts int ,
printing int . The code course.enroll("Object") is passed a String value. Although
String is also an Object , this method calls the specific (not general) type of the argu-
ment passed to it. So course.enroll("Object") calls the overloaded method that
accepts String , printing String .*/