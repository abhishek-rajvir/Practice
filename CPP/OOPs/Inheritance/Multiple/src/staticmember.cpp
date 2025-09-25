#include <iostream>

class test{
    public:
        //static member var
        static int value;
    
        test(){
            value=1;
        }

        static void printval(){
            std::cout << value << std::endl;
        }

        ~test(){}

};

int test::value = 9;

int main(){
    test::printval();
    test t1;
    test::printval();
}