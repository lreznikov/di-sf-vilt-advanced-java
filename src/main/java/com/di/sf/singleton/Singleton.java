package com.di.sf.singleton;

import java.util.Objects;

public class Singleton {
    private static Singleton instance;

    private static final Object monitor = new Object();

    private Singleton() {
        System.out.println("Creating an instance of Singleton() on thread [" + Thread.currentThread().getName() + "]");
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (monitor) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public int foo() {
        return instance.hashCode();
    }

    public synchronized void foo2() {
        foo();
    }
}
