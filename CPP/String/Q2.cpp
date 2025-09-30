#include <iostream>
#include <string>

using namespace std;

int main(){
    int size = 0;
    string str_arr[100];

    cout << "Enter number of strings: " << endl;
    cin >> size;
    
    for (int i = 0; i < size; i++)
    {
        cout << "Enter string no." << i+1 << ": ";
        cin >> str_arr[i];
    }
    
    for (int i = 0; i < size; i++){
        cout << str_arr[i] << endl;
    }
    
    int max_index = 0;
    int maxlen = str_arr[0].length();

    for (int i = 0; i < size; i++){
        if (maxlen < str_arr[i].length())
        {
            max_index = i;
        }
        
    }

    cout << "The longest string is: " << str_arr[max_index] << endl;


}