// Add B class under hpack package
package hpack;

// Sub class
public class B extends A {
    // Overrided show method of super_class(A)
    public void show(){
        System.out.println("Hello im B class");
    }
    // Overloaded method to call super_class(A) show method
    public void show(A a){
        super.show();
    }
}