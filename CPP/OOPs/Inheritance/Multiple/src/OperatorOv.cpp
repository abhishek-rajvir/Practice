//
// Created by SURESH on 25-09-2025.
//

#include <iostream>

class Integer {
private:
    int value;

public:
    Integer(int val): value(val) {}

    int getVal() { return value; }

    Integer operator +(const Integer& i) {
        this->value += i.value;
        return *this;
    }
    
    Integer operator -(const Integer& i) {
        this->value -= i.value;
        return *this;
    }
};

int main() {
    Integer i1(3),i2(51);
    i1+i2;
    i2-i1;
    std::cout << i1.getVal() << std::endl;
}