// import Scanner
import java.util.Scanner;

class Calculation
{
    private int x;
    private int y;
    Calculation(){}
    Calculation(int x,int y) { 
        this.x = x;
        this.y = y;
    }

    public int Add(){
        return x+y;
    }
    public static int Add(int x,int y){
        return x+y;
    }
    public int Sub(){
        return x-y;
    }
    public static int Sub(int x,int y){
        return x-y;
    }
}

// create class for main func
class MyCalculation extends Calculation{
    // main function
    public static void main(String[] args){
        Calculation c1 = new Calculation(3,5);
        System.out.println("Addition: " + c1.Add() );
        System.out.println("Substraction: " + c1.Sub() );
    }
}