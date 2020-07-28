package com.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Beta {
    public static void main(String[] args) {

        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);

        System.out.println(integerQueue);

        integerQueue.poll();

        System.out.println(integerQueue);
    }
}
