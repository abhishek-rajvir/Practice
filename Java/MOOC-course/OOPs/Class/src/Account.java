// import Scanner class
import java.util.Scanner;

// create account class
public class Account{
    // states or data members or attributes
    private String username;
    private double balance;


    // Default Constr
    Account(){
        balance = 0.0;
        username = "NA";
    }

    // Parameterised Constr
    Account(String username,double initial_deposit){
        System.out.println("Account created successfully under username:"+username);
        balance = 0.0;
        this.username = username;
        this.deposit(initial_deposit);
    }

    // getter for balance
    public double get_balance(){
        return balance;
    }

    //Deposit method
    public void deposit(double amount){
        if (amount>=0.0){
            balance += amount;
            System.out.println("Deposit of "+ amount +"$ succesfull ");
        }
        else{
            System.out.println("Invaid amount "+amount+"$");
        }
    }

    //Withdraw method
    public void withdraw(double amount){
        if ( (balance-amount) >=0 ){
            balance -= amount;
            System.out.println("Withdrawl of "+ amount +"$ succesfull ");
        }
        else{
            System.out.println("Insuffcient balance to withdraw "+amount+"$");
        }
    }
}

// Bank class to create account and perform transactions
class Bank{
    // Create main method
    public static void main(String[] args){
        // create scanner instance
        Scanner sc = new Scanner(System.in);
        // creating instance of Account with deposit and username
        Account ramSwissBank = new Account("Ram",100);
        // withdrawing excess amount
        ramSwissBank.withdraw(300);
        // printing account balance
        System.out.println("Account balance: "+ramSwissBank.get_balance());
        // free scanner
        sc.close();
    }
}