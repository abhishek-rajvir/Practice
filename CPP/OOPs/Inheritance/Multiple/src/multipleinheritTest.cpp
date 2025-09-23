#include <iostream>

class A{
    public:
        void print() { printf("I'm A"); }
};

class B{
    public:
        void print() { printf("I'm B"); }
};

class C : public B, public A{
    public:
        void print() { printf("I'm C"); }
};

int main(){
    A* a = new C;
    B* b = new C;
    C* c = new C;
    c->print();
}