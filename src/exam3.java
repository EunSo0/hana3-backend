import java.util.Scanner;

public class exam3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String str = "";

    for(int i = 1; i <= n; i++){
      str += i%3 == 0 ? "X " : i+" ";
    }

    System.out.println(str);
  }
}
