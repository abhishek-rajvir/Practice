#include <iostream>

class Mgr{
    public:
        virtual void doo() const{
            std::cout << "I am a manager" << std::endl;
        }
};

class SalesPerson{
    public:
        void doo() const override{
            std::cout << "I am a SalesPerson" << std::endl;
        }
};

class SalesMgr: public SalesPerson,public Mgr{
    public:
        void doo() const override{
            std::cout << "I am a SalesMgr" << std::endl;
        }
};


int main(){
    SalesMgr s1;
    s1.doo();
}