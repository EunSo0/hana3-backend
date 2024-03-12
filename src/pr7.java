import java.util.Scanner;

public class pr7 {
  public static int sum(int n){
    int s = n*(n+1)/2;
    if(n < 1) return 0;
    return s + sum(n-1);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    System.out.println(sum(num));
  }
}
