#pragma once

#include "../Headers/Date.h"

#ifndef DATE_H
#define DATE_H

#ifndef EMPLOYEE_H
#define EMPLOYEE_H

class Employee {
    private:
        int id;
        std::string name;
        Date dob;

    public:
        // default constr
        Employee();

        // parameterised constr
        Employee(int id, std::string name, Date dob);

        // setter
        void accept(int id, std::string name, Date dob);

        // toString
        void display();
};

#endif // DATE_H
#endif // EMPLOYEE_H