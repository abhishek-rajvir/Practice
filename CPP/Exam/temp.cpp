#include <iostream>
#include <limits>
using namespace std;

int main()
{
	int sd;
	// cout << "Hello weokrosekfsdkfasf;lkasdfk sfa";
	// cin >> sd;
	// cout << "Hello weokrosekf";
	cin.ignore();
	if(!(cin >> sd)){
		cout << "Not a int";
		cin.ignore(numeric_limits<streamsize>::max(),'\n');
		cin.clear();
	}
	else{
		cout << sd;
	}

	cin.ignore(numeric_limits<streamsize>::max(),'\n');
	if(!(cin >> sd)){
		cout << "Not a int";
		cin.ignore();
		cin.clear();
	}
	else{
		cout << sd;
	}
	
	return 0;
}