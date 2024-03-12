import java.util.HashSet;
import java.util.Set;

public class pr5 extends Thread {
  private static Set<Integer> home = new HashSet<>();
  private static int[] base = new int[3];
  private static int player = 1;
  private static int outCount = 0;
  private static int strike = 0;
  private static int ball = 0;

  public static void main(String[] args) {
    System.out.println("게임시작!");
    playGame();
    System.out.println("게임종료!");
  }

  static void playGame() {
    while(outCount < 3){
      if(strike == 0 && ball == 0){
        System.out.println(player+"번타자");
      }

      int num = (int)(Math.random()*2);

      if(num == 0){
        strike++;
        System.out.println("스트라이크!");
      } else{
        ball++;
        System.out.println("볼~");
      }

      if(strike == 3){
        System.out.println("삼진 아웃!");
        outCount++;
        resetOut();
        home.add(player);
        changePlayer();
      }
      if(ball == 4){
        System.out.println("1루 진루");
        goToBase();
        resetOut();
        changePlayer();
      }
      if(home.size() == 4) return;

      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
  static void resetOut() {
    strike = 0;
    ball = 0;
  }
  static void goToBase(){
    if(base[2] == 1) {
      home.add(player);
      base[2] = 0;
    }
    for (int i = 2; i > 0; i--) {
      if (base[i - 1] == 1) {
        base[i] = 1;
        base[i - 1] = 0;
      }
    }
    base[0] = 1;
  }
  static void changePlayer(){
    do{
      player++;
      player = player > 4 ? 1 : player;
    }while(home.contains(player));
  }
}