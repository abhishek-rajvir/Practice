#include <iostream>

using namespace std;

class Ticket{
    int basefare = 30;
    
    public:
        int getBasefare() const {
            return basefare; 
        }

        virtual int calculateTicketFare(int distance) const {
            return 0;
        }

};

class Bus : public Ticket{
    int Rate = 4;
    public:
        int calculateTicketFare(int distance) const override {
            return getBasefare() + Rate * distance;
        }
};

class Train : public Ticket{
    int Rate = 2;
    public:
        int calculateTicketFare(int distance) const override {
            return getBasefare() + Rate * distance;
        }
};

int main(){
    Ticket* b = new Bus();
    // Ticket* b1 = new Train();
    Ticket* b1 = Train();
    if (typeid(*b1).name() == typeid(Bus).name()) {
        cout << (dynamic_cast<Bus*>(b1))->calculateTicketFare(3) << endl;
    }
    else{
        cout << (dynamic_cast<Train*>(b1))->calculateTicketFare(3) << endl;

    }
    return 0;
}