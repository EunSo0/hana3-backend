import java.util.Random;

public class exam2 {
  public static void main(String[] args) {
    Random rd = new Random();
    String str = "";

    while(str.split(" ").length < 6){
      int num = rd.nextInt(45)+1;
      boolean duplicate = false;

      for(String s: str.split(" ")){
        if(s.equals(Integer.toString(num))){
          duplicate = true;
          break;
        }
      }

      if(duplicate){
        str += num + "(중복발생!재추첨) ";
      } else{
        str += num + " ";
      }
    }

    System.out.println(str);
  }
}
