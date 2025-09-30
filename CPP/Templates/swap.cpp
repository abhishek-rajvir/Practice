#include <iostream>

using namespace std;

template <typename T>
void Swap(T* src,T* dest){
    T temp = *src;
    *src = *dest;
    *dest = temp;
}

int main(){

    int a=0,b=0;
    cout << "Enter 1st num: " << endl;
    cin >> a;
    
    cout << ("Enter 2nd num: ") << endl;
    cin >> b;
    
    cout << "No.s before swapping: " << a << ", " << b << endl;
    
    Swap<int> (&a,&b);

    cout << "No.s before swapping: " << a << ", " << b << endl;

    return 0;
}