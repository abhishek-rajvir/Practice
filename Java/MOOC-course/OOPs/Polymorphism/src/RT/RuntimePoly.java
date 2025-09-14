package RT;

class A{
    public void show(){
        System.out.println("I am A..");
    }
}
class B extends A{
    public void show(){
        System.out.println("I am B..");
    }
}

class RuntimePoly{
    public static void main(String[] args){
        // upcasting subclass obj to A
        A obj1 = new A();
        obj1.show();
        // downcasting superclass obj to B
        if (obj1 instanceof B ){ // safe down cast only obj is truely a instance of B
            B obj2 = (B)obj1;
            obj2.show();
        }
    }
}