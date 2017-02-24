package com.panhainan;

import java.util.Stack;

/**
 * @Use: 仅通过递归和栈逆转一个栈
 * @Author: Hainan Pan (FireOct)
 * @Date: 2017/2/24
 * @Email: panhainan@yeah.net
 * @QQ: 1016593477
 * @WebSite: http://panhainan.com
 */
public class RecursiveReverseStack {

    public static Stack<Integer> reverse(Stack<Integer> stack){
        reverseStack(stack);
        return stack;
    }

    private static void reverseStack(Stack<Integer> stack){
        if (stack.empty()){
            return ;
        }else{
            int i = getAndRemoveLastElement(stack);
            reverseStack(stack);
            stack.push(i);
        }
    }

    private static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.empty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

}
