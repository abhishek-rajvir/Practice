// Add A class under hpack package
package hpack;

// Super class A
public class A {
    // show method
    public void show(){
        System.out.println("Hello im A class");
    }
    // overloaded above method with B class parameter
    // Class a doesnt know which child inherits it
    public void show(B b){
        System.out.println("Hello i've B class hostage..");
    }
}