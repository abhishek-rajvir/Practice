// package name
package com.exp;

// public class
public class ExceptionsDemo{
    public static void show(){
        sayhello(null);
    }
    public static void sayhello(String name){
        if (name == null){
            throw ArithmeticException;
        }
        else{
            System.out.println("Hello "+name.toUpperCase());
        }
    }
}