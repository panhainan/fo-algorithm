package com.panhainan;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Use: 由两个栈实现的队列
 * @Author: Hainan Pan (FireOct)
 * @Date: 2017/2/24
 * @Email: panhainan@yeah.net
 * @QQ: 1016593477
 * @WebSite: http://panhainan.com
 */
public class TwoStackQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }

    public int add(int value) {
        return stackPush.push(value);
    }

    public int poll() {
        stackPushToStackPop();

        return stackPop.pop();
    }

    public int peek() {
        stackPushToStackPop();
        return stackPop.peek();
    }

    private void stackPushToStackPop() {
        if (empty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    public boolean empty(){
        return stackPop.empty() && stackPush.empty();
    }

    public int size(){
        return stackPop.size()+stackPush.size();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Iterator<Integer> stackPopIterator = stackPop.iterator();
        while(stackPopIterator.hasNext()){
            sb.insert(0,", ").insert(0, stackPopIterator.next());
        }
        sb.insert(0,"[");
        Iterator<Integer> stackPushIterator = stackPush.iterator();

        while(stackPushIterator.hasNext()){
            sb.append(stackPushIterator.next()).append(", ");
        }
        if(!empty()){
            sb.replace(sb.length()-2,sb.length(),"");
        }
        sb.append("]");

        return sb.toString();
    }

}
