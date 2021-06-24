package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Asynchron
public class ExecuMain {
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorInvoke() {
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("executor example");
        });
    }

    private static void executorServiceInvoke() {
        ExecutorService exeutorService = Executors.newFixedThreadPool(10);//size 10 create a pool of thread to execute a Task whenever we need es.
        exeutorService.submit(() -> {
            System.out.println("executor service example");
        });
    }
}

