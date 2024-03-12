import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class pr8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    String[] arr = input.split(" ");
    int[] intArr = new int[arr.length];

    for(int i = 0; i<arr.length; i++){
      intArr[i] = Integer.parseInt(arr[i]);
    }
    Arrays.sort(intArr,2, intArr.length);
    String result = "";

    for(int i = 0; i < intArr[0]; i++){
      if(i != 0 && i%intArr[1] == 0) result += "\n";
      result += intArr[i+2] + " ";
    }

    System.out.println(result);
  }
}
