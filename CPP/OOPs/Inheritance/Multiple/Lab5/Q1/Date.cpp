//
// Created by SURESH on 24-09-2025.
//

#include "../Headers/Date.h"

// Date class method definations
Date::Date() : day(1), month(1), year(1995) { ; }

// set a ephoc date
Date::Date(int day, int month) {
    this->day = day;
    this->month = month;
}

Date::Date(int day, int month, int year) {
    this->day = day;
    this->month = month;
    this->year = year;
}

void Date::accept(int day, int month, int year) {
    this->day = day;
    this->month = month;
    this->year = year;
}

// printdate method
std::string Date::datePrint() {
    return std::to_string(day) + "-" + std::to_string(month) + "-" + std::to_string(year);
}
//
// int main() {
//     // Date instance;
//     Date today(24, 9, 2025);
//     Date yesterday;
//
//     today.datePrint();
// }
