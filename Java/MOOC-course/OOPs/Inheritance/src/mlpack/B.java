// Add B class under mlpack package
package mlpack;

// Sub class
public class B extends A {
    // Overrided show method of super_class(A)
    public B(){
        System.out.println("Constructor of B is called..");
    }
    public void show(){
        System.out.println("Hello im B class");
    }
    // Overloaded method to call super_class(A) show method
    public void show(A a){
        super.show();
    }
}