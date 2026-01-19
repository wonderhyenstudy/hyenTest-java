package _4_Test_260116.ex;

// 생각을 단순하게 하자!!!
public class _1_Ex_StudentMain {
    public static void main(String[] args) {
//    실습1
//    성적이 90점 이상인 학생만 출력하시오.
//    샘플학생 3명 생성
//    학생이름, 점수

//    StudentEx1 를 요소로 가지는 배열을 생성해서,
//    샘플 학생 3명 생성, 배열에 담아서, 반복문 이용해서 출력하기.
//    학생 이름과, 점수를 출력하기.

        StudentEx1[] arr = {
            new StudentEx1("학생1", 45),
            new StudentEx1("학생2", 80),
            new StudentEx1("학생3", 98)
        };
//        arr.createStudents();]
        System.out.println("///////////////////////// 실습1 //////////////////////////");

        System.out.println("///////////////////////////// 학생 다 뽑아와 /////////////////////////////");
        for (StudentEx1 s : arr){
            s.studentPrint();
        };
        System.out.println();
        System.out.println("///////////////////////// 90점 이상 학생 뽑아와 //////////////////////////");
        for (StudentEx1 s : arr){
            if(s.Score >= 90){
                s.studentPrint();
            }
        }

        System.out.println("///////////////////////// 실습2 //////////////////////////");
        StudentEx1 students = new StudentEx1("학생이름", 66); // students(인스턴스) 생성. 호출
//        StudentEx1 students = new StudentEx1("", 0);
        StudentEx1[] arr2 = students.createStudents();
        
        // 배열을 뽑아내는 방법
       for (StudentEx1 m : arr2) {
           System.out.println("학생이름 : " + m.name + " , " + "점수 : " + m.Score);
       }

        System.out.println("================연습용================");
        System.out.println("================ 배열 아니고 하나만 뽑아보기 ================");
        StudentEx1 ss = new StudentEx1("이름입니다", 100);
        ss.studentPrint();
        System.out.println("================ 배열 뽑아보기 ================");
        StudentEx1 rr = new StudentEx1("", 0);
        StudentEx1[] stestArr = rr.studentArr();



    }
}
