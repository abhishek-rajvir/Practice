#include <iostream>

class A{
    private:
        int value = 3;
    public:
        friend B;

        friend void getVal(){
            return value;
        }
};

class B{

};

int main(){
    B b;
    b.getVal();
}