package _5_Test_260119.ex;

public class _3_3_Ex_Car extends _3_3_Ex_Vehicle{

    @Override
    void move() {
        System.out.println("도로를 달립니다");
    }

    @Override
    void fuel() {
        super.fuel();
        System.out.println("dddd");
    }
}
