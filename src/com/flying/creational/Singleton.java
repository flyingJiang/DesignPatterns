package com.flying.creational;

/**
 * Static Singleton
 * Lazy Loading
 * Threadsafe
 */
public class Singleton {

    public static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
