//
// Created by SURESH on 25-09-2025.
//

#include <iostream>

class CTP {
private:
public:
    void func(int x) {
        std::cout << "I am int" << std::endl;
    }

    void func(std::string x) {
        std::cout << "I am string" << std::endl;
    }



};

int main() {
    CTP c1,c2;
    c1.func(3);
    c2.func("3");

}