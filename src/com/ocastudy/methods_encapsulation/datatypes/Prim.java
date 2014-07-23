package com.ocastudy.methods_encapsulation.datatypes;

/**
 * Created by dana on 7/23/14.
 */
public class Prim {
    public static void main(String[] args) {
        int num1 = 12;
        float num2 = 17.8f;
        boolean eJavaResult = true;
        boolean returnVal = num1 >= 12 && num2 < 4.567
                || eJavaResult == true;
        System.out.println(returnVal);
    }
}
/* Both the short-circuit operators && and || have the same operator precedence. In
the absence of any parentheses, they are evaluated from left to right. The first expres-
sion, num1 >= 12 , evaluates to true . The && operator evaluates the second operand
only if the first evaluates to true . Because && returns true for its first operand, it eval-
uates the second operand, which is ( num2 < 4.567 || eJavaResult == true ). The sec-
ond operand evaluates to true ; hence the variable returnVal is assigned true .*/