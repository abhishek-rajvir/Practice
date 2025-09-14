#include <iostream>

int main(){
    int a = 67; // container a with val 
    int* ptrInt = &a; // int type pointer to a
    char* ptrChar = (char*)ptrInt; //char type pointer to ptrInt
    
    std::cout << "int " << *ptrInt << std::endl; // prints 67
    std::cout << "char " << *ptrChar << std::endl; // prints C
    std::cout << "int: " <<  ptrInt << " char: " << ptrChar << std::endl;  
    
    return 0;
}