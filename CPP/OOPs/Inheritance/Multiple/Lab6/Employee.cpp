#include <iostream>

class Employee{
    private:
        // fields
        int id;
        std::string name;
        int deptid;
        double basicSalary;
    public :
        Employee(int id,std::string name,double basicSalary){
            this->id = id;
            this->name = name;
            this->basicSalary = basicSalary;
        }

        ~ Employee() {}
        
        virtual double computeSalary() const {
            return 0;
        }

        std::string getName() const {
            return name;
        }

        double getSalary() const {
            return basicSalary;
        }
};

class Mgr: public Employee{
    private:
        // fields
        double perfbonus;
    public:
        Mgr(int id,std::string name,double basicSalary,double perfBonus): Employee(id,name,basicSalary), perfbonus(perfBonus) {}
        ~Mgr(){}

        double computeSalary() const override{
            return (getSalary() + perfbonus);
        }
};

class Worker : public Employee{
    private:
        // fields
        double hourswrkd;
        double hourlyrate;

    public:
        Worker(int id,std::string name,double basicSalary,double hourlyRate,double hoursWrkd): Employee(id,name,basicSalary), hourswrkd(hoursWrkd), hourlyrate(hourlyRate) {}
        
        double computeSalary() const override {
            return this->getSalary()+(hourlyrate*hourswrkd);
        }

        // getter
        double getHourlyRate(){
            return hourlyrate;
        }
};

int main(){
    Mgr managers[] = {
        Mgr(1, "Alice", 50000, 10000),
        Mgr(2, "Bob",   55000, 12000),
        Mgr(3, "Carol", 60000, 15000)
    };

    Worker workers[] = {
        Worker(101, "Charlie", 20000, 200, 160),
        Worker(102, "David",   22000, 250, 170),
        Worker(103, "Eva",     25000, 300, 180)
    };

    // bool flag = false;
    
    std::cout << "Manager details..." << std::endl;
    for(Mgr e: managers){
        std::cout << "Employee name: " << e.getName() << ", Computed Salary: " << e.computeSalary() <<std::endl;
    }
    std::cout << std::endl;

    std::cout << "Worker details..." ;
    for(Worker e: workers){
        std::cout << "Employee name: " << e.getName() << ", Computed Salary: " << e.computeSalary() <<std::endl;
    }
    
}