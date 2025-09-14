#include <iostream>

int main(){
	int x = 84;
	void* ptr = &x;
	// stores address like normal pointer
	printf("%p\n",ptr);
	// must be typecasted to specific type first  and dereference it
	printf("%d\n",*(int*)ptr);
	return 0;
}
