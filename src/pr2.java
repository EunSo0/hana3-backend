public class pr2 {
//  public static void main(String[] args) {
//    Random rd = new Random();
//    String str = "";
//
//    while(str.split(" ").length < 6){
//      int num = rd.nextInt(45)+1;
//      boolean duplicate = false;
//
//      for(String s: str.split(" ")){
//        if(s.equals(Integer.toString(num))){
//          duplicate = true;
//          break;
//        }
//      }
//
//      if(duplicate){
//        str += num + "(중복발생!재추첨) ";
//      } else{
//        str += num + " ";
//      }
//    }
//
//    System.out.println(str);
//  }
public static void main(String[] args) {
  int[] arrLotto = new int[6];
  for(int i = 0; i<6; i++){
    int lotto = (int)(Math.random() * 45) + i;
    System.out.println(lotto);
    arrLotto[i] = lotto;
    for(int j=1; j<i; j++){
      if(arrLotto[i] == arrLotto[j]){
        System.out.println("중복수: "+arrLotto[i]);
        i--;
        break;
      }
    }
  }
}
}
