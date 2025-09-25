//
// Created by SURESH on 24-09-2025.
//

#pragma once
#include <iostream>
#include <string>

#ifndef DATE_H
#define DATE_H


class Date {
    private:
        // member

        int day;
        int month;
        int year;

    public:
        // method declarations

        // default constr
        Date();

        // parameterised constr
        Date(int day, int month);
        Date(int day, int month, int year);

        // setter method
        void accept(int day, int month, int year);

        // display function
        std::string datePrint();
};


#endif //DATE_H
