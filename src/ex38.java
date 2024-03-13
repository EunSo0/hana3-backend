// 생성자함수 - 메소드 오버로딩이 가능하다.
// : 매개변수의 타입과 개수를 다르게 함으로 함수를 확장하는 것

class Robot {
  String color = "빨강";
  //기분(필드가 없는) 생성자함수
  public Robot(){

  }
  // 필드가 있는 생성자 함수
  public Robot(String color){
    this.color = color;
  }
}

public class ex38 {
  public static void main(String[] args) {

  }
}
