#include <iostream>

using namespace std;

int main() {
    bool flag = true;
    int choice = 0;
    while (flag) {
        cout << "-------Fashion Management system------- " << endl;
        cout << "1. Add Clothing product" << endl;
        cout << "2. Add Accessory product" << endl;
        cout << "3. Display all fashion product " << endl;
        cout << "4. Calculate discount of fashion product " << endl;
        cout << "5. Exit " << endl;
        cout << "\nEnter your choice : ";
        cin >> choice;

        switch (choice) {
            case 1:

            case 5:
                cout << " Exiting application Thank you ..." << endl;
                flag = false;
                break;
            default:
                cout << "Invalid option" << endl;
        }
    }
}