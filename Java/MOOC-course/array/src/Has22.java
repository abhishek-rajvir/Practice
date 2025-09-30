import java.util.Scanner;
import java.util.Arrays;
  import java.util.stream.IntStream;

class Hass22{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int arr[] = new int[sc.nextInt()];
      arr = Arrays.stream(arr).map(i->sc.nextInt()).toArray();
      boolean found = false;
      final int data[] = arr;
      arr = IntStream.range(0,arr.length).filter( j -> data[j]==2).toArray();

      if (arr[0] + 1 == arr[1]) {
          System.out.println("Ok");
      }
      else {System.out.println("Not Ok");}

    }
  }
}