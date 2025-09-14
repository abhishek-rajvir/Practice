// importing scanner class
import java.util.Scanner;

class Login{
    public static void main(String[] args){
        // Scanner instance
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();

        // compare user and pass by invoking check method
        if (check(username,password)){
            System.out.println("Succesfull login..");
        }
        else { System.out.println("Invalid username or password..");}
    }

    // check method returns bool
    static boolean check(String username,String password){
        // Hardcoded String arr of username & password
        String[] USER = {"alex","emma"};
        String[] PASS = {"sunshine","haskell"};
        int index = 0;
        for(String u : USER){
            if (u.equals(username)) {
                if (PASS[index].equals(password))
                    return true;
            }
            else{ index++; }
        }
        return false;

    }
}