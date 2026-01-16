package _4_Test_260116.ex;

public class _3_Ex_Employee {
//    실습3
//    부모클래스
//    Employee` 클래스를 부모로 하여
//        1) protected String department ;
//        2) 생성자 : 매개변수 1개인



    // 변수선언 : 상속전용. protected -> 같은 패키지나 상속받은 자식만 사용가능
    protected String department ;

    // 생성자 선언
    public _3_Ex_Employee(String department) {
        this.department = department;
    }
}
