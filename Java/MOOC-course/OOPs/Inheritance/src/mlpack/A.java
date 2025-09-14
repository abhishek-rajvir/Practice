// Add A class under mlpack package
package mlpack;

// Super class A
public class A {
    // default constructor
    public A(){
        System.out.println("Constructor of A is called..");
    }
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