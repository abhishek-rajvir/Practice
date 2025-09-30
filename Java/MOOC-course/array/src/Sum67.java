import java.util.Scanner;
import java.util.Arrays;

class Sum67{
	public static void main(String[] s1){
		try(Scanner sc = new Scanner(System.in);){
			int arr[] = new int[sc.nextInt()];
			arr = Arrays.stream(arr).map(i->sc.nextInt()).toArray();
			int sum = 0;
			for (int j = 0 ; j < arr.length ; j++ ) {
				if(arr[j]==6){
					while(arr[j]!=7){
						j++;
					}
				}
				else{
					sum+=arr[j];
				}
			}
			System.out.println(sum);
		}
	}
}