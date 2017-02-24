package com.panhainan;


public class TwoStackQueueTest {

    public static void main(String[] args) {
        TwoStackQueue twoStackQueue = new TwoStackQueue();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t", twoStackQueue.add(i));
        }
        System.out.println();
        System.out.println(twoStackQueue);
        twoStackQueue.poll();
        System.out.println(twoStackQueue);
        twoStackQueue.add(11);
        twoStackQueue.add(16);
        System.out.println(twoStackQueue);
        /*while (!twoStackQueue.empty()){
            System.out.printf("%d|%d\t", twoStackQueue.peek(), twoStackQueue.poll());
        }*/

    }
}