#include <iostream>

int main(){
	int x[2] = {65,43};
	int* ptr = x;

	// print(ptr) stores address of first element
	for(int i=0;i<2;i++){
		printf("%d\n",*ptr++); // increment pointer address its holding
	}
	ptr--;	// decrement pointer address its holding

	// basic arithmetics
	printf("%d\n",*ptr + *ptr+1);
	printf("%d\n",*ptr - *ptr+1);	
	printf("%d\n",*ptr * *ptr+1);
	printf("%d\n",*ptr / *ptr+1);
	return 0;
}
