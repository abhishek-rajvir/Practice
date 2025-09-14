#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void main(){
	char str[] = "This is a string";
	char* str1 = str;
	char* str2;
	printf("%s\n",str);
	printf("%d\n",(int)strlen(str)); // string len
	str2 = strcat(str1,"Hello");
	printf("%s\n",str2); // string concat
	strcpy(str2,str1); // string copy
	printf("%s\n",str2);
}
