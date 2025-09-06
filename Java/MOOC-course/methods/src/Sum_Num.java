import java.util.Scanner;

class Sum_Num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.print("Enter 2 num to add: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        Sum_Num(n1,n2);
    }
    public static void Sum_Num(int x,int y){
        System.out.println(x+"+"+y+"="+(x+y));
    }
}