import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    int k = 123;
    System.out.println(k%10);
    System.out.println(k/10%10);
    System.out.println(k/100);

    double d = 3.567;
    // 소숫점 없애기
    // 1. Math.floor
    // 2. (int)
    System.out.println((int)(d%1*10));

    System.out.println(Math.round(d));
    System.out.println(String.format("%.0f", d));

    System.out.println(Math.round(d*10) / 10.0);
    System.out.println(String.format("%.1f", d));
  }
}
