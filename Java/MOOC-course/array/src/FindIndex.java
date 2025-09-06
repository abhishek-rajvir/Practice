import java.util.Scanner;

class FindIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4,5,7,8,9,10,4};
        System.out.print("Search for? ");
        int find = sc.nextInt();
        boolean found = false;
        for(int i = 0; i< arr.length ; i++){
            if ( arr[i] == find ){
                found = true;
                System.out.printf("%d is at index %d.%n",find,i);
            }
        }
        if (found) {}
        else { System.out.printf("%d was not found.%n",find); }
    }
}