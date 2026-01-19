package _5_Test_260119.ex;

public class _1_Ex_Main {
    public static void main(String[] args) {
        System.out.println("========== 본인 =============");
        //본인
        _1_Ex_B Main = new _1_Ex_B();
//        Main.show();

        System.out.println("========== 업 캐스팅 =============");

        // 부모타입
        // 작은 타입 -> 큰 타입 : 업 캐스팅
        _1_Ex_A p = new _1_Ex_B();
        p.show();

        System.out.println("========= 타입검사/다운캐스팅==============");

        // 타입 검사 해보기
        if (p instanceof _1_Ex_B) {
            _1_Ex_B c = (_1_Ex_B) p; // 다운 캐스팅
//            System.out.println("자식 타입입니다.");
            c.show();
        }





    }
}
