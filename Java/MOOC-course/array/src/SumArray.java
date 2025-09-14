import java.util.Scanner;

class SumArray{
    public static void main(String[] args){
        int[] numbers = {3,4,5,7,9,1,3};
        System.out.println("Sum of all no. in array: "+sumofNumbersInArray(numbers));
    }
    static int sumofNumbersInArray(int[] arr){
        int total = 0;
        for(int i = 0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }
}