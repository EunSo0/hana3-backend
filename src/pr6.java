import java.util.Scanner;

public class pr6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String result = "";

    for(int i = 0; i <= n; i+=2){
      for(int j = 0; j < (n-i)/2; j++){
        result += " ";
      }
      for(int l = 0; l < i+1; l++){
        result += "*";
      }
      result += "\n";
    }
    System.out.println(result);
  }
}
