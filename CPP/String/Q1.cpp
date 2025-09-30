#include <iostream>
#include <string>

using namespace std;

int main(){
    string str;
    cout << "Enter a sentence: ";
    getline(cin , str);

    int pos;
    int index = 0;
    for (char ch : str){
        if (ch == ' ')
        {
            str.replace(index,1,".");
        }
        else{
            
            if (isupper(ch))
            {
                str.replace(index,1,string(1,tolower(ch)));
            }
            else{
                str.replace(index,1,string(1,toupper(ch)));
            }
        }
        index++;
        
    }

    cout << "The modified string is: " <<
    str << endl;
}
