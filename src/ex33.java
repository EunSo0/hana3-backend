//연습문제 - 싱글톤 만들기
//클래스 이름 : HanaAccount
//  필드 : 계좌번호(1234), 고객이름(홍길동), 잔액(1000), 이자율(년3%)
//  메소드 : 입금(+100), 출금(-100), 이자계산(1년후 잔액), 잔액조회

class HanaAccount {
  private int account = 1234;
  private String name = "홍길동";
  private int balance = 1000;
  private double rate = 0.03;

  private static HanaAccount singleton = new HanaAccount();
  static HanaAccount getInstance(){
    if(singleton == null){
      singleton = new HanaAccount();
    }
    return singleton;
  }

  public void deposit() {
    this.balance += 100;
    System.out.println(this.balance);
  }
  public void withdraw() {
    this.balance -= 100;
    System.out.println(this.balance);
  }
  public void calcInterest() {
    this.balance += (int) (this.balance * rate);
    System.out.println(this.balance);
  }
  public int getBalance() {
    return balance;
  }
}

public class ex33 {
  public static void main(String[] args) {
    //싱글톤을 호출후
    HanaAccount hana = HanaAccount.getInstance();
    //1. 입금 메소드 호출
    hana.deposit();
    //2. 출금 메소드 호출
    hana.withdraw();
    //3. 이자계산은 이자율을 읽어서 참조한다.
    //   이자계산후 잔액 증가한다.
    hana.calcInterest();
    //4. 최종 잔액을 출력한다.
    System.out.println(hana.getBalance());
  }
}