import java.util.Scanner;

public class Counthi{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in);)
		{
			String s1 = sc.nextLine();
				int hi = 0;
				while(s1.indexOf("hi")!=-1){
					hi+=1;
					s1 = s1.substring(s1.indexOf("hi")+2);
				}
			System.out.println(hi);
		}
	}
}