import java.util.Scanner;
import java.util.Arrays;

class Sum13{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in);){
			int arr[] = new int[sc.nextInt()];
			arr = Arrays.stream(arr)
				.map(i->sc.nextInt()).toArray();
			System.out.println(Arrays.stream(arr).filter(s->s<13).sum());
		}
	}
}