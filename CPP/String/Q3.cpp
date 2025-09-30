#include <iostream>

using namespace std;

int main(){
    int sum = 0;
    string s = "abc123";
    for(int c : s){
        if( ( 48 <= c ) && (c <=57) ){
            sum+= c-48;
        }
    }
    cout << sum << endl;
}