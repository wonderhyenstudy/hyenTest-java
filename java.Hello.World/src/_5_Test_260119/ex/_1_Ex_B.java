package _5_Test_260119.ex;

public class _1_Ex_B extends _1_Ex_A{

    public _1_Ex_B() {
    //        내용, 각 클래스명 이름 출력
//        super();
        System.out.println("자식" + "," +  "_1_Ex_B");
    }

    @Override
    public void show() {
        System.out.println("자식 show" + "," +  "_1_Ex_A");
    }

}
