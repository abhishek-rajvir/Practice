
import java.util.Scanner;




public class MenuTest
{
    enum Menu{
        
        // enums
        IDLI(25),
        DOSA(30),
        POHA(20),
        UTTAPPA(35),
        VADAPAV(10);
        
        // field
        final int value; // shouldn't be modified once set
        int qty = 0; // qty of item bought

        // constructor
        Menu(int value){
            this.value = value;
        }
        
        // setter method
        void addQty(){
            this.qty++;
        }
        
        // getter method
        int getValue(){
            return this.value;
        }
        int getQty(){
            return this.qty;
        }
    }

	public static void main(String[] args) {
        int bill = 0;
        boolean flag = true;
        System.out.println("\n\n-------------Welcome to ANNA's Nasta------------------");

        try (Scanner sc = new Scanner(System.in)) {
            while (flag) { 
                System.out.println("\n\nSr.no\tItems\tPrice");
                System.out.println("1.\t"+Menu.IDLI+"\t"+Menu.IDLI.getValue());
                System.out.println("2.\t"+Menu.DOSA+"\t"+Menu.DOSA.getValue());
                System.out.println("3.\t"+Menu.VADAPAV+"\t"+Menu.VADAPAV.getValue());
                System.out.println("4.\t"+Menu.UTTAPPA+"\t"+Menu.UTTAPPA.getValue());
                System.out.println("5.\t"+Menu.POHA+"\t"+Menu.POHA.getValue());
                System.out.print("Enter a choice: ");
                switch(sc.nextInt()){
                    case 1:
                        Menu.IDLI.addQty();
                        bill+=Menu.IDLI.getValue();
                        break;
                    case 2:
                        Menu.DOSA.addQty();
                        bill+=Menu.DOSA.getValue();
                        break;
                    case 3:
                        Menu.VADAPAV.addQty();
                        bill+=Menu.VADAPAV.getValue();
                        break;
                    case 4:
                        Menu.UTTAPPA.addQty();
                        bill+=Menu.UTTAPPA.getValue();
                        break;
                    case 5:
                        Menu.POHA.addQty();
                        bill+=Menu.POHA.getValue();
                        break;
                    default:
                        System.out.print("I am done..");
                        flag = false;
                        break;
                }

            }
            System.out.println("\n\n-------------Generating Bill------------------");
            System.out.println("Sr.no\tItems\tQty\tAmount");
            System.out.println("1.\t"+Menu.IDLI+"\t"+Menu.IDLI.getQty()+"\t"+Menu.IDLI.getValue() );
            System.out.println("2.\t"+Menu.DOSA+"\t"+Menu.DOSA.getQty()+"\t"+Menu.DOSA.getValue() );
            System.out.println("3.\t"+Menu.VADAPAV+"\t"+Menu.VADAPAV.getQty()+"\t"+Menu.VADAPAV.getValue() );
            System.out.println("4.\t"+Menu.UTTAPPA+"\t"+Menu.UTTAPPA.getQty()+"\t"+Menu.UTTAPPA.getValue() );
            System.out.println("5.\t"+Menu.POHA+"\t"+Menu.POHA.getQty()+"\t"+Menu.POHA.getValue() );
            System.out.println("Total Bill:-  "+bill);
        }
	}
}

