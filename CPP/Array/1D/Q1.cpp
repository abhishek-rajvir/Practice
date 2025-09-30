#include <iostream>

void add_elem(int* arr,const int& n){
    for (int i = 0; i < n; i++)
    {
        std::cout << "Enter Element" << i+1 << ": ";
        std::cin >> arr[i];
    }
}

void display_elem(const int* arr,const int& n) {
    std::cout << std::endl;
    for (int i = 0; i < n; i++)
    {
        std::cout << "Enter Element" << i+1 << ":" << arr[i] << std::endl; 
    }
    std::cout << std::endl;
}

void calculateRange(const int* arr,const int& n) {
    int max = arr[0];
    int min = arr[0];
    for (int  i = 0; i < n; i++)
    {
        if (max < arr[i] ){
            max = arr[i];
        }
        else if (min > arr[i]){
            min = arr[i];
        }
        else {
            continue;
        }
    }
    
    std::cout << "The range of array is " << max-min << std::endl;
}

int main(){
    // container to store size of array
    int n;

    // create a int type pointer for array
    int* arrPtr;

    // get size
    std::cout << "Enter no. of elements: ";
    std::cin >> n;
    
    // allocate n size of memory to array
    arrPtr = new int[n];

    // store array
    add_elem(arrPtr,n);
    
    // display array
    display_elem(arrPtr,n);

    // calculate range
    calculateRange(arrPtr,n);

    
}