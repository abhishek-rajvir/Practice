#include "../Headers/Employee.h"

Employee::Employee() {
    id = 0;
    name = "N/A";
}

Employee::Employee(int id,std::string name,Date dob) {
    this->id = id;
    this->name = name;
    this->dob = dob;
}

void Employee::accept(int id,std::string name,Date dob) {
    this->id = id;
    this->name = name;
    this->dob = dob;
}

void Employee::display(){
    std::cout << "Id: " << id << "," <<
        " Name: " << name << "," <<
        "Date: " << dob.datePrint() << "," << std::endl;
}
