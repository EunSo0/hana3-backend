public class ex02 {
  public static void main(String[] args) {
    System.out.println("화면출력");
    System.out.println("화면"+"출력");
    System.out.println("화면"+10+20);
    System.out.println(10+20+"화면");
    // 연산자 우선순위가 헷갈리면 소괄호로 묶어준다.
    System.out.println(10+(20+"화면"));

    // println print printf
    // println: 문자열 한줄 출력
    // print: 줄바꿈 없음
    // printf: 형식화된 출력문
    System.out.println("한출 출력 후 줄바꿈");
    System.out.print("한줄출력 후 줄바꿈 없음");
    System.out.printf("%d\n", 30);
    System.out.printf("%o", 30); // 8진수
    System.out.printf("%x\n", 30); // 16진수
    System.out.printf("%e\n", 300.0); // 지수형 출력

    System.out.println("Coding is Good!");
    System.out.println("Java" + "Programming");
    System.out.printf("%d\n", 123);
    System.out.printf("%05d\n", 123);
    System.out.printf("%.3f", 123.45f);
  }
}
