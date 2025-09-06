import java.util.Scanner;

class Square_num{
    public static void main(String[] args){
        System.out.print("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The square of "+num+" = "+(num*num));
        sc.close();
    }
}