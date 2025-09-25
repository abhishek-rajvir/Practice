#include <iostream>

inline void hello(){
    std::cout << "Hello" << std::endl;
}

std::string str = "I am global string";

int main(){
    std::string str = "I am local string";
    hello();
    std::cout << str << std::endl;
    std::cout << ::str << std::endl;
}