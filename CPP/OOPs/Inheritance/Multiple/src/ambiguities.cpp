#include <iostream>

class A{
    public:
        int value = 10;
};

class B{
    public:
        int value = 20;
};

class C: public A,public B{
    public:
        int value = 0;
};


int main(){
    C* c = new C;

    std::cout << c->A::value << std::endl ;
    std::cout << c->B::value << std::endl;
}