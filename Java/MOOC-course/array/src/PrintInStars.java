// importing scanner class
import java.util.Scanner;

class PrintInStars{
    // main method
    static public void main(String[] args){
        // Scanner instance
        Scanner sc = new Scanner(System.in);
        // initialised int arr
        int[] arr = {3,4,5,7,2,0};
        // invoke printstar method with arr parameter
        printStars(arr);
        // free sc object
        sc.close();
    }
    // static method to printstars with 1 signature
    static void printStars(int[] arr){
        // for-each loop
        for(int i:arr){
            // i = arr[0]..arr[n-1]
            for(int j = 0;j<i;j++){
                // prints * till arr[i]
                System.out.print("*");
            }
            // new line 
            System.out.println();
        }
    }
}