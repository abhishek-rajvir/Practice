#include <iostream>
#include <memory>

using namespace std;

void disp_elem(int* arr,const int n){
    for (int i = 0; i < n; i++)
    {
        cout << "Element" << i+1 << ": " << arr[i] << endl;
    }
}

void add_elem(int* arr,const int n){
    cout << endl;
    for (int i = 0; i < n; i++)
    {
        cout << "Enter element" << i+1 << ": ";
        cin >> arr[i];
    }
    cout << endl;
}

void del_elemt(int* arr,int& n){
    int index;
    cout << "\nEnter index to delete: ";
    cin >> index;
    
    n = n-1;
    int* temparr = new int[n];

    for (int i = 0,j=0; j < n+1; i++,j++)
    {
        if(index){
            // pass
        }
        else{
            temparr[i] = arr[j];
            i++;
        }
        j++;

    }
    arr = temparr;
    
}

int main(){
    int n = 0;
    cout << "Enter size of array: " ;
    cin >> n;

    int* arrPtr = new int[n];
    
    add_elem(arrPtr,n);
    del_elemt(arrPtr,n);
    disp_elem(arrPtr,n);
    
}