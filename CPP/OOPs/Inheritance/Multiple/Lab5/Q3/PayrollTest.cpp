#include <iostream>
#include "../Headers/PayrollSoft.h"


int main() {
    PayrollSoft ps(2,"Bubu",300);
    ps.calculateSal();
    std::cout << ps.getGrossSal() << " "
    << ps.getNetSal();
}