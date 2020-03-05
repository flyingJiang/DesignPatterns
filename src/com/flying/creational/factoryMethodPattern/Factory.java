package com.flying.creational.factoryMethodPattern;

import java.util.Calendar;

/**
 *  Concepts
 *  doesn't expose instantiation logic
 *  defer to subclasses
 *  common interface
 *  specified by architecture, implemented by user
 *  Example, Calender, ResourceBundle, NumberFormat
 *
 */
public class Factory {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
    }
}
