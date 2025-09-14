#include <stdio.h>

void foo(double* arr){
	printf("%ld\n",sizeof(arr)/sizeof(arr[0]) );
}

int main(){
	double x[] = {3,4,5,6,8};
	double* arr = x;
	printf("%ld\n",sizeof(x)/sizeof(x[0]) );
	foo(x);
}
