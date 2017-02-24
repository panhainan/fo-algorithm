package com.panhainan;


import java.util.Stack;

public class RecursiveReverseStackTest {

    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }
        System.out.println(stack);
        System.out.println(RecursiveReverseStack.reverse(stack));
    }
}