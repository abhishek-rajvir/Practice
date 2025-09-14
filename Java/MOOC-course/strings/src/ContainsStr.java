// import scanner class
import java.util.Scanner;

// create default class
class ContainsStr{
    // create main method
    public static void main(String[] args){
        // create scanner instance
        Scanner sc = new Scanner(System.in);
        // create String container 
        System.out.print("Enter a string: ");
        // get string input from user
        String str = sc.nextLine().trim();
        // check if string empty
        if (str.isEmpty()){
            System.out.println("Error: Empty string...");
        }
        else{
            doesContains(str);
        }
        // free scanner instance
        sc.close();
    }
    // static method to check whether AV is init
    static void doesContains(String str){
        // String array with elements splitted
        String[] splitStr = str.split(" ");
        // for each loop
        for(String word: splitStr){
            // compare strings
            if ( word.contains("av") ){
                // print if contains
                System.out.println(word);
            }
            // else continue
            else{ ; }
        }
    }
}