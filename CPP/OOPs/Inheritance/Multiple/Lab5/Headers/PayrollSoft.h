#pragma once
#include "../Headers/Employee.h"

#ifndef PAYROLLSOFT_H
#define PAYROLLSOFT_H

#ifndef EMPLOYEE_H
#define EMPLOYEE_H

class PayrollSoft : public Employee {

    private:
        double BasicSalary, HRA, PF, NetSalary, GrossSalary, Medical = 1000, PT = 200;

    public:
        PayrollSoft(int id,std::string name,double basic_salary);
        void calculateSal();

        double getGrossSal();

        double getNetSal();
};

#endif
#endif
