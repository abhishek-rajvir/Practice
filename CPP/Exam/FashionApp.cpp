#include <iostream>
#include <string>
#include <exception>
#include <typeinfo>
#include <vector>
#include <algorithm>

using namespace std;

class InvalidProductException: public exception{
private:
	string message;
public:
 	InvalidProductException(const string m){
		message = m;
	}

	virtual const char* what() const noexcept override{
		return message.c_str();
	}
	~InvalidProductException(){}

};

class FashionProduct{
	private:
		string Product_Name;
		string Brand;
		double Price;
		int Qty;
	public:
		FashionProduct(){}
		FashionProduct(string Product_Name,string Brand,double Price,int Qty){
			this->Product_Name = Product_Name;
			this->Brand = Brand;
			this->Price = Price;
			this->Qty = Qty;
		}

		virtual void display(){
			cout << "Product_Name: " << Product_Name << endl;
			cout << "Brand: " << Brand << endl;
			cout << "Price: " << Price << endl;
			cout << "Qty: " << Qty << endl;
		}
	protected:
		double getPrice(){
			return Price;
		}

};

class Clothing: public FashionProduct{
	private:
		string Cloth_type;
		string Material;

	public:
		Clothing(string Product_Name,string Brand,double Price,int Qty, string Cloth_type, string Material)
			:FashionProduct(Product_Name,Brand,Price,Qty){

			transform(Cloth_type.begin(), Cloth_type.end() ,Cloth_type.begin() , ::tolower);
			this->Cloth_type = Cloth_type;
			this->Material = Material;
		}

		void display() override {
			FashionProduct::display();
			cout << "Cloth_type: " << Cloth_type << endl;
			cout << "Material: " << Material << endl;
		}

		void calculateDiscount() {
			if ( Cloth_type =="shirt")
			{
				double price = getPrice();
				cout << "15% Discount on shirt (" <<
				price << " - " << price*0.15 << " ) Final price = " <<  
				price - price*0.15 << endl;
			}
			else{
				cout << "Discount is not applicable on this product" << endl;
			}
		}

};

class Accessory: public FashionProduct{
	private:
		string Category;
		string color;
	public:
		Accessory(string Product_Name,string Brand,double Price,int Qty, string Category, string color)
			:FashionProduct(Product_Name,Brand,Price,Qty){
			transform(Category.begin(), Category.end() ,Category.begin() , ::tolower);
			this->Category = Category;
			this->color = color;
		}

		void display() override {
			FashionProduct::display();
			cout << "Category: " << Category << endl;
			cout << "color: " << color << endl;
		}

		void calculateDiscount() {
			if ( Category =="bag")
			{
				double price = getPrice();
				cout << "27% Discount on bag (" <<
				price << " - " << price*0.26 << ") Final price = " <<
				price - price*0.27 << endl;
			}
			else{
				cout << "\nDiscount is not applicable on this product" << endl;
			}
		}
};

int main(){

	// list of fashion products
	vector<FashionProduct*> products;

	bool flag = true;
	int choice = 0;

	string Product_Name;
	string Brand;
	string Cloth_type;
	string Material;
	string Category;
	string color;
	double Price;
	int Qty;

	do{
		cout << "\n\n------Fashion Management System------" << endl;
		cout << "1.\tAdd Clothing product " << endl;
		cout << "2.\tAdd Accessory product " << endl;
		cout << "3.\tDisplay all products " << endl;
		cout << "4.\tShow discount on all products " << endl;
		cout << "5.\tExit" << endl;
		cout << "\nEnter your choice: " ;
		
		if(!(cin >> choice)){
			cin.clear();
			cin.ignore();
			cout << "Only integer are allowed as input" << endl;
			continue;
		}

		switch(choice){
			case 1:
				cout << endl;
				cout << "Product_Name: "; cin >> Product_Name;
				cout << "Brand: "; cin >> Brand;
				cout << "Price: "; cin >> Price;
				cout << "Qty: "; cin >> Qty;
				cout << "Cloth_type: "; cin >> Cloth_type;
				cout << "Material: "; cin >> Material;
				cout << endl;
		
				products.push_back(new Clothing(Product_Name,Brand,Price,Qty,Cloth_type,Material));
				break;

			case 2:		
				cout << endl;
				cout << "Product_Name: "; cin >> Product_Name;
				cout << "Brand: "; cin >> Brand;
				cout << "Price: "; cin >> Price;
				cout << "Qty: "; cin >> Qty;
				cout << "Category: "; cin >> Category;
				cout << "color: "; cin >> color;
				cout << endl;

				products.push_back(new Accessory(Product_Name,Brand,Price,Qty,Category,color));
				break;

			case 3:
				if (products.empty())
				{
					cout << "\n\n---No products to display--- " << endl;
				}
				else{
					cout << "\n\nDisplaying all products--- " << endl;
					choice = 0;
					for ( FashionProduct* f : products ){
						cout << "\n\nProduct" << choice+1 << ": " << endl;
						if (typeid(*f) == typeid(Accessory))
						{
							dynamic_cast<Accessory*>(f)->display();
						}
						else{
							dynamic_cast<Clothing*>(f)->display();
						}
						choice++;
					}	
				}
				
				break;

			case 4:
				for ( FashionProduct* f : products ){
					if (typeid(*f) == typeid(Accessory))
					{
						dynamic_cast<Accessory*>(f)->calculateDiscount();
					}
					else{
						dynamic_cast<Clothing*>(f)->calculateDiscount();
					}
				}
				break;

				cout << endl;
				break;

			case 5:
				cout << "\nExiting application " << endl;
				flag = false;
				break;

			default:
				cout << "..Invalid choice please try again.." << endl;
		}
	}while(flag) ;

}