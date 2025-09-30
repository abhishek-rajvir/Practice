#include <iostream>

using namespace std;

int main(){
    int size = 0;

    int* arr;
    arr = (int*)calloc(sizeof(1),sizeof(int));
    
    int num;
    cout << "Enter a decimal number: ";
    cin >> num;

    while (num>1)
    {
        // cout << num << endl;
        if ( num%2 == 0 ){
            arr[size] = 0;
        }
        else{
            arr[size] = 1;
        }
        arr = (int*)realloc(arr,++size);
        num = num/2;
    }
    arr[size] = 1;
    
    cout << endl;
    for (int i = size; i >=0 ; i--)
    {
        cout << arr[i];
    }
    cout << endl;
    

}