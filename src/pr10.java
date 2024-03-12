import java.util.Arrays;
import java.util.Scanner;

public class pr10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();

    String[] strArr = str.split("");
    Arrays.sort(strArr);
    String sortStr = String.join("",strArr);

    int open = sortStr.lastIndexOf("(")-sortStr.indexOf("(") + 1;
    int close = sortStr.lastIndexOf(")")-sortStr.indexOf(")") + 1;

    System.out.println(open + " " + close);
  }
}
