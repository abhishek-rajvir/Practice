import java.util.Scanner;

class Swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println();
        int[] num_arr = new int[size];
        for (int i = 0;i<size;i++){
            System.out.print("Enter a value: ");
            num_arr[i] = sc.nextInt();
            System.out.println();
        }
        for (int i = 0;i<size;i++){
            System.out.printf("Element%d: %d%n",(i+1),num_arr[i]);
        }
        System.out.printf("Give two indices to swap: %n");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        if ( (0<=s1 && s1<size) || (0<=s2 && s2<size) ){
            int temp = num_arr[s1];
            num_arr[s1] = num_arr[s2];
            num_arr[s2] = temp;
            for (int i = 0;i<size;i++){
                System.out.printf("Element%d: %d%n",(i+1),num_arr[i]);
            }
        }
        else{
            System.out.println("Index out of range..");
        }


    }
}