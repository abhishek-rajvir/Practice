import java.util.Scanner;
import java.util.Arrays;
import java.util.OptionalInt;

class CenteredAvg{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in);){
			int size = sc.nextInt();
			int arr[] = new int[size];
			for (int i = 0;i<size;i++ ) {
				arr[i] = sc.nextInt();
			}

			OptionalInt max = Arrays.stream(arr).max();
			OptionalInt min = Arrays.stream(arr).min();
			
			Arrays.sort(arr);

			int arr2[] = new int[size-2];

			for (int i = 1;i<size-1;i++ ) {
				arr2[i-1] = arr[i];
			}


			System.out.println();
			System.out.println(Math.floor(Arrays.stream(arr).average().getAsDouble()));



		}
	}
}