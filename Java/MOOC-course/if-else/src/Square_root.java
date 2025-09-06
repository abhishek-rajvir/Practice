import java.util.Scanner;

class Square_root{
    public static void main(String[] argg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2 num: ");
        int num = sc.nextInt()+sc.nextInt();
        System.out.printf("The square root of %d = %.3f",num,(Math.sqrt(num)));
        sc.close();
    }
}