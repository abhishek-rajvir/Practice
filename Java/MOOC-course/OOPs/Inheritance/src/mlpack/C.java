// Add C class under mlpack package
package mlpack;

// Sub class
public class C extends B {
    public C(){
        System.out.println("Constructor of C was called..");
    }
    public C(B b){
        super();
    }

    public C(A a){
        this();
    }
    // Overrided show method of super_class(C)
    public void show(){
        System.out.println("Hello im C class");
    }
}