import java.util.Scanner;

public class exam4 {
  public static String three(int n){
    String str = "";

    for(String s: Integer.toString(n).split("")){
      if(Integer.parseInt(s)%3 == 0 && s.equals("0")){
        str += "X";
      }
    }
    return str;
  };

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for(int i = 1; i <= 40; i++){
      // 컴퓨터
      if(i%2 != 0){
        String com = three(i);

        if(com.isEmpty()){
          System.out.println("컴퓨터 : " + i);
        }else{
          System.out.println("컴퓨터 : " + com);
        }
      } else{
        //나
        String input = scanner.next();
        String me = three(i);

        if(me.isEmpty()){
          if(!input.equals(Integer.toString(i))){
            System.out.println("컴퓨터 승!");
            return;
          }
        }else{
          if(!input.equals(me)){
            System.out.println("컴퓨터 승!");
            return;
          }
        }
      }
    }
    System.out.println("무승부!");
    return;
  }
}
