#include "../Headers/PayrollSoft.h"

PayrollSoft::PayrollSoft(int id, std::string name, double basic_salary) :Employee(id,name),
        BasicSalary(basic_salary),
        HRA(0.5 * basic_salary),
        PF(0.12 * basic_salary),
        NetSalary(0.0),
        GrossSalary(0.0) { }

void PayrollSoft::calculateSal()
{
        GrossSalary = BasicSalary + HRA + Medical;
        NetSalary = GrossSalary - (PT + PF);
}
double PayrollSoft::getGrossSal() {
        return GrossSalary;
}

double PayrollSoft::getNetSal() {
        return NetSalary;
}