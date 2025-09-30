import java.util.regex.*;
import java.util.Scanner;

public class EndOther{

	public static void checkEnds(String str1,String str2){

		System.out.println(str2.substring(str2.length()-str1.length()));

		if (str2.substring(str2.length()-str1.length()).equals(str1)){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}	
	}

	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in);){
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();

			if (str1.length()<=str2.length()) {
				checkEnds(str1,str2);
			}
			else{
				checkEnds(str2,str1);
			}

		}
	}
}