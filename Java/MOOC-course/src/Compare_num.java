import java.util.Scanner;

class Compare_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1<num2){
            System.out.printf("%d < %d",num1,num2);
        }
        else if (num1>num2){
            System.out.printf("%d > %d",num1,num2);
        }
        else{
            System.out.printf("%d == %d",num1,num2);
        }
        sc.close();
    }
}