#include <iostream>
#include <cmath>

const double PI = 3.141592653589793;

class Shape{
    // fields
    private:
        double a;
        double area;
    protected:
        friend void set_a(Shape& s,double value){
            s.a = value;
        }
    public:
        // default constr
        Shape(): a(0) {}

        // parameterised constr
        Shape(double a){
            this->a = a;
        }

        virtual double calculatArea() = 0 ; // abstract method or pure virtual function
        
        ~Shape() {}

        // getter
        virtual double Volume() const { return 0.0; }

        double get_a() const {
            return a;
        }

        // disp func
        virtual void display() const { // normal unimplemented methods are allowed in abstract class
            std::cout << "This is abstract method" << std::endl;
        }
        
};

class Rectangle: public Shape{
    private:
        double y;
        double Volume() { return 0.0; }
    public:
        Rectangle(): Shape(0),y(0) {}
        Rectangle(double x, double y): Shape(x) {
            this->y = y;
        }

        ~Rectangle(){}

        void setData(int x,int y) {
            set_a(*this,x);
            this->y = y;
        }

        double calculatArea() override {
            return (this->get_a() * y);
        }


        void display() const override {
            std::cout << "X: " << this->get_a() << ",Y: " << y << std::endl;
        }

};

class Sphere: public Shape{
    private:
        double radius;
    public:
        Sphere(): Shape(0) {}
        Sphere(double rad): Shape(rad) {}
        ~Sphere(){}

        void setData(int rad) {
            set_a(*this,rad);
        }
        
        double calculatArea() override {
            return 4.0*PI*pow(this->get_a(),2.0);
        }
        double Volume() const override {
            return (4.0/3.0)*PI*pow(this->get_a(),3.0);
        }

        void display() const override{
            std::cout << "Radius: " << radius << std::endl;
        }
        
};


int main(){
    Rectangle* rect = new Rectangle();
    Sphere* spr = new Sphere();
    rect->setData(3,4);
    rect->display();
    std::cout << rect->calculatArea() << std::endl;
    std::cout << std::endl;
    spr->setData(6);
    spr->display();
    std::cout << spr->calculatArea() << std::endl;
    std::cout << spr->Volume() << std::endl;
    return 0;
}