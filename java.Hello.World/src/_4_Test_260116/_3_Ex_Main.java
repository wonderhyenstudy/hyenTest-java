package _4_Test_260116;

import _4_Test_260116.ex._3_Ex_Manager;

public class _3_Ex_Main {
    public static void main(String[] args) {
//        메인 클래스
//        샘플 Manager 2개 정도 만들고,
//                부서를 출력 해보기.

        _3_Ex_Manager part1 = new _3_Ex_Manager("기획부");
        _3_Ex_Manager part2 = new _3_Ex_Manager("홍보부");
        _3_Ex_Manager part3 = new _3_Ex_Manager("인사부");
        part1.printDept();
        part2.printDept();
        part3.printDept();

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        _3_Ex_Manager.name = "자식 길동이";
        System.out.println(_3_Ex_Manager.name);

        System.out.println();
        System.out.println("========================================");
        System.out.println();


    }
}
