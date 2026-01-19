package _3_Test_260115.ex;

public class _4_Ex_StarbucksMain {
    public static void main(String[] args) {
//    2) 실행 클래스 : StarCoffeeMain
//    - 샘플 주문, 3개 주문을 하고,
//    - 각각 매개변수 1개 생성자 호출
//    - 매개변수 2개인 생성자 호출
//    - 매개변수 3개인 생성자 호출
//    각각의 주문 내역서 호출하기.

        Starbucks coffee = new Starbucks();
        Starbucks coffee1 = new Starbucks("디카페인") ;
        Starbucks coffee2 = new Starbucks("자몽허니블랙티", "그란떼");
        Starbucks coffee3 = new Starbucks("핫초코", "숏", false, "혠이");

        coffee.StarbucksMenu();
        coffee1.StarbucksMenu();
        coffee2.StarbucksMenu();
        coffee3.StarbucksMenu();

    }
}
