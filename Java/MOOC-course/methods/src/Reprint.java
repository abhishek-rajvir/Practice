import java.util.Scanner;

class Reprint{
    void greet(){
        System.out.println("In a hole in the ground there lived a method");
    }
    static void greet(int n){
        for (int i = 0;i<n;i++){
            System.out.println("In a hole in the ground there lived a method");
        }
    }

    public static void main(String[] args){
        // variable container for count
        int count = 0;
        // Creating scanner instance
        Scanner sc = new Scanner(System.in);
        // Creating Reprint instance;
        Reprint obj = new Reprint();
        
        /* with object creation. */
        System.out.print("How many times: ");
        count = sc.nextInt();
        for (int i = 0;i<count;i++){
            // Invoke non-static method
            obj.greet();
        }
        /* Without creating instance */
        System.out.println();
        System.out.print("How many times: ");
        count = sc.nextInt();
        // Invoke static method
        greet(count);
        // Clearing the object
        sc.close();
    }
}