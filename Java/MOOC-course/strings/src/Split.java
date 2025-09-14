// import Scanner
import java.util.Scanner;

class Split{
    // main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.equals("")){
            // do nothing
        }
        else{
            pieces
        }
    }

    // String split method
    static void strSplit(String s){
        // Split " " to an array
        String[] pieces = s.split(" ");
        // for-each loop to print each piece
        for(String piece : pieces){
            System.out.println(piece);
        }
    }
}