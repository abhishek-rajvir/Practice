import java.util.List;
import java.util.ArrayList;



public class contextEx{

	public static int getNext(String str){
		try{
			return str.indexOf(">")+1;
		}
		catch(Exception e){
			return -1;
		}
	}

	public static boolean compare(String str,int x1,int x2){
		return (str.substring(1,x1-1).equals(str.substring(x2+1,x2+x1-1)) && str.indexOf("</")!=-1);
	}

	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		
		String s1 = "<h2>hello man</h2><h1>sdw</h2><J3>yo yo</J3>";
		String s2;

		int x1;
		int x2;

		while(true) {
			s2 = new String(s1);
			x1 = getNext(s2);
			x2 = getNext(s2.substring(x1));
			if (x1==-1 || x2==-1) {
				System.out.println("Invalid 2")	;
			}
			else{
				if (compare(s1,x1,x2)) {
					// System.out.println(s1.substring(x2+x1).equals(""));
					list.add(s1.substring(x1,x2-1));
				}
				else{
					;
				}
			}
			if ( s1.substring(x2+x1).equals("") ){
				break;
			}
			else{
				s1 = s1.substring(x2+x1);
			}
		}
		list.forEach(s -> System.out.println(s) );

	}
}