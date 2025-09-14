import java.util.Scanner;

class Absolute_value{
    public static void main(String[] vargs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        System.out.printf("|%d| : ",num);
        if (num<0){
            num = num*-1;
        }
        else{
            ;
        }
        System.out.println(num);
        sc.close();
    }
}