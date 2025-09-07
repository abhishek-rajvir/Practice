import hpack.*;

class HeirarcicalTest{
    public static void main(String[] arg){
        A a = new B();
        B b = new B();
        a.show(b);
        b.show(a);
    }
}