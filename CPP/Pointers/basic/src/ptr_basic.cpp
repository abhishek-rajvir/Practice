#include <iostream>

int main(){
	int a = 9; // container a storing value 9
	int* p = &a; // points to value at address of a
	std::cout << (&p) << std::endl ; // print address of p
	std::cout << (p) << std::endl ; // print value/address stored in p
	std::cout << (*p) << std::endl ; // print value at address stored in p
	std::cout << (&a) << std::endl ; // print address of a
}