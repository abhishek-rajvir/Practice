#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    vector<int> values(0);
    cout << values.size() << endl;
    cout << values.capacity() << endl;

    values.push_back(3);
    values.push_back(5);
    values.push_back(0);
    values.push_back(2);
    sort(values.begin(),values.end());

    cout << "\nSt" << endl;
    for (int v : values)
    {
        cout << v << endl;
    }
    
    
    values.clear();
    
    cout << "\nSt" << endl;
    for (int v : values)
    {
        cout << v << endl;
    }

}