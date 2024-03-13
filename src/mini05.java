// 성적관리 프로그램
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Student {
  String name;
  int kor;
  int eng;
  int math;

  public Student(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }
}

public class mini05 {
  public static List<Student> list = new ArrayList<Student>();
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("-----------성적 관리 프로그램-------------");
      System.out.print("1.입력  2.전체출력  3.검색  4.수정  5.삭제  6.종료 : ");
      int n = scanner.nextInt();

      switch(n){
        case 1:
          System.out.print("이름 입력 : ");
          String name = scanner.next();
          System.out.print("국어점수 입력 : ");
          int kor = scanner.nextInt();
          System.out.print("영어점수 입력 : ");
          int eng = scanner.nextInt();
          System.out.print("수학점수 입력 : ");
          int math = scanner.nextInt();
          list.add(new Student(name, kor, eng, math));
          break;
        case 2:
          for(Student s : list){
            System.out.print("이름: " + s.name + " ");
            System.out.print("국어: " + s.kor + " ");
            System.out.print("영어: " + s.eng + " ");
            System.out.print("수학: " + s.math + " ");
            System.out.print("총점: " + (s.kor+s.eng+s.math) + " ");
            System.out.println("평균: " + (s.kor+s.eng+s.math)/3 + " ");
          }
          break;
        case 3:
          System.out.print("검색할 사람의 이름 : ");
          String findName = scanner.next();
          for(Student s : list){
            if(Objects.equals(s.name, findName)){
              System.out.print("이름: " + s.name + " ");
              System.out.print("국어: " + s.kor + " ");
              System.out.print("영어: " + s.eng + " ");
              System.out.print("수학: " + s.math + " ");
              System.out.print("총점: " + (s.kor+s.eng+s.math) + " ");
              System.out.println("평균: " + (s.kor+s.eng+s.math)/3 + " ");
            }
          }
          break;
        case 4:
          System.out.print("수정할 사람의 이름 :");
          String editName = scanner.next();
          System.out.println();
          System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 :");
          int no = scanner.nextInt();
          System.out.println();
          System.out.print("수정할 점수:");
          int score = scanner.nextInt();
          //검색
          String searchWord = editName;
          int index = 0;
          for(Student student : list){
            if(searchWord.equals(student.name)){
              if(no == 1){
                student.kor = score;
              }
              else if(no == 2){
                student.eng = score;
              }else{
                student.math = score;
              }
              list.set(index, student);
              break;
            }
            index++;
          }
          break;
        case 5:
          System.out.print("삭제할 사람의 이름 : ");
          String deleteName = scanner.next();
          Student deleteStudent = null;
          for(Student s : list){
            if(Objects.equals(s.name, deleteName)){
              deleteStudent = s;
              break;
            }
          }
          if (deleteStudent != null) {
            list.remove(deleteStudent);
          } else {
            System.out.println("삭제할 대상을 찾을 수 없습니다.");
          }
          break;
        case 6:
          return;
      }
    }
  }
}
