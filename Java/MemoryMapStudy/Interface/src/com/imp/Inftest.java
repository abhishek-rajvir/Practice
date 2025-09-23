package com.imp;

interface Animal{
    void  speak();
}

interface Fish{
    void swim();
}

interface Bird{
    void fly();
}

interface Human extends Animal,Fish,Bird{
    void walk();
}

class Person implements Human{
    @Override
    public void fly(){
        System.out.println("Flying");
    }
    
    @Override
    public void  speak(){
        System.out.println("Bow Bow");
    }
    
    @Override
    public void swim(){
        System.out.println("Swiming");
    }
    
    @Override
    public void walk(){
        System.out.println("Walking");
    }
}

public class Inftest{
    public static void main(String[] args){
            Human person = new Person();
            person.walk();
   }   
}