package _4_Test_260116;


// 배열은 어렵다. 하지만 중요하다!!!


public class _1_Test_EX {
    public static void main(String[] args) {
//        연습 1
//        3명의 학생 정보를 저장하는 `Student` 객체 배열을 만들고 이름을 출력하시오.

//        _1_Student[] students = {
//            new _1_Student("학생1"),
//            new _1_Student("학생2")
//            new _1_Student("학생3")
//        }

        _1_Student[] arr = {
            new _1_Student("학생1"),
            new _1_Student("학생2"),
            new _1_Student("학생3")
        };

        for(_1_Student s : arr) {
            System.out.println(s.name);
        }








    }
}
