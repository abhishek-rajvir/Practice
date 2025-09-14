#include <iostream>

using namespace std;

int foo(int* x){
	return *x+=1;
}

int main(){
	int x = 3;
	int* y = &x;
	cout << foo(&x) <<endl;
	cout << foo(y) <<endl;

}
