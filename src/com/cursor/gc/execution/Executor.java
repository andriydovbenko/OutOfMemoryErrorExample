package com.cursor.gc.execution;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private static final Integer CAPACITY = 200_000_000;
    private static final Integer VALUE = 1000_000_000;

    public static void executeOutOfMemoryExample() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory at the beginning: " + runtime.totalMemory());
        System.out.println("Free memory at the beginning: " + runtime.freeMemory());
        List<Integer> list = new ArrayList<>(CAPACITY);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            list.add(VALUE);
        }
    }
}