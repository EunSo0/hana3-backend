import java.util.Scanner;

public class pr9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = (int)(Math.random() * 100 + 1);

    while(true){
      System.out.println("번호를 입력하세요.");
      int n = scanner.nextInt();

      if(num == n) {
        System.out.println("정답입니다.");
        break;
      } else if(num > n){
        System.out.println("번호가 정답보다 작습니다.");
      } else{
        System.out.println("번호가 정답보다 큽니다.");
      }
    }
  }
}
