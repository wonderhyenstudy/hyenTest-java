package _4_Test_260116.ex;

import _4_Test_260116._1_Student;

// 할수있다!!!!!
public class StudentEx1 {

//1) 성적이 90점 이상인 학생만 출력하시오.
//    클래스명 StudentEx1 :
//    멤버 변수 : name(String), score(int)
//    생성자 : 매개변수가 2개인 생성자 생성
//
//    StudentEx1 를 요소로 가지는 배열을 생성해서,
//    샘플 학생 3명 생성, 배열에 담아서, 반복문 이용해서 출력하기.
//    학생 이름과, 점수를 출력하기.
//
//2)
//    객체 배열을 반환하는 메소드 만들기
//    메소드명 : createStudents
//    반환타입: StudentEx1
//    이용해보기.


    // 1. 변수선언
    String name;
    int Score;

    // 2. 생성자
    // 메인 생성자
    public StudentEx1(String name, int score) {
        this.name = name;
        this.Score = score;
    }
    // 3. 출력 메소드
    void studentPrint() {
        System.out.println("학생이름 : " + this.name + " , " + "점수 : " + this.Score);
    }


//    2)
//    객체 배열을 반환하는 메소드 만들기
//    메소드명 : createStudents
//    반환타입: StudentEx1
//    이용해보기.
     public StudentEx1[] createStudents() {
        return new StudentEx1[] {
            new StudentEx1("더미 학생1", 95),
            new StudentEx1("더미 학생2", 100),
            new StudentEx1("더미 학생3", 85)
        };
    };

    public StudentEx1[] studentArr() {
        return new StudentEx1[] {
                new StudentEx1("덤덤1", 50),
                new StudentEx1("덤덤2", 80),
                new StudentEx1("덤덤3", 100)
        };
    }






}
