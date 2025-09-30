import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class contextEx2{

	// public static boolean(str){

	// }

	public static void main(String[] args) {
		String s1 = "<h2>hello man</h2>";
		// String s1 = "<h2>hello man</h2><h1>sdw</h2><J3>yo yo</J3>";
		
		Pattern strtp = Pattern.compile("<[A-Za-z0-9]+>.*");
		Pattern endp = Pattern.compile("<[/]?[A-Za-z0-9]+>.*");

		Matcher strt = strtp.matcher(s1);
		Matcher end = endp.matcher(s1);
		while (strt.find() && end.find())
		{
			for (int i = 0; i <= strt.groupCount() ; i++ ) {
    			System.out.println(strt.group(0)+" "+end.group(i)+" "+strt.group(i).equals(end.group(i)));
			}
		}
		// else{
		//     System.out.println("match not found");
		// }
	}
}