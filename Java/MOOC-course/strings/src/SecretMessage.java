// import Scanner class
import java.util.Scanner;

class SecretMessage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your message:");
        String secret = "";
        String input;
        while(true){
            input = sc.nextLine();
            if (input.isEmpty()){
                break;
            }
            else{
                secret += input.charAt(0);
            }
        }
        System.out.println("The secret message was: " + secret);
    }
}