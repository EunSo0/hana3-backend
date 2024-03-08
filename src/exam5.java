import java.util.Random;

public class exam5 extends Thread {
  public static void main(String[] args) {
    Random rd = new Random();
    int base[] = new int[4];
    int outCount = 0;
    int strike = 0;
    int ball = 0;


    System.out.println("게임시작!");

    do{
      if(strike == 0 && ball == 0){
        System.out.println(player+"번타자");
      }

      int num = rd.nextInt(2);

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
        strike = 0;
        ball = 0;
        player++;
      }
      if(ball == 4){
        System.out.println("1루 진루");
        strike = 0;
        ball = 0;
        player++;
      }

      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }while(outCount < 3 || player < 4);

    System.out.println("게임종료!");
    return;
  }
}
