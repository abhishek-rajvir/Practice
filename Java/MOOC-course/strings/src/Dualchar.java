import java.util.Scanner;

public class Dualchar{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			String s1 = sc.nextLine();
			StringBuilder s2 = new StringBuilder();
			for (char ch : s1.toCharArray() ) {
				s2.append(ch);
				s2.append(ch);
			}
			System.out.println(s2);
		}
	}
}