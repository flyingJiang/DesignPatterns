package com.flying.creational.singletonPattern;

/**
 * Static Singleton
 * Lazy Loading
 * Threadsafe
 * Such as, Runtime, Logger, Spring Beans, Graphic Managers
 */
public class Singleton {

    public static volatile Singleton instance = null;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
