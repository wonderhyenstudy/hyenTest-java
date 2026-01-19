package _3_Test_260115.ex;

public class _3_Ex_BookMain {

    public static void main(String[] args) {

        // [클래스명] [참조형 변수이름(객체명,인스턴스라고 부름)] = new  [클래스명]();
//        방법 1 : 기본 생성자 이용할 경우
//        Book book1 = new Book();
//        book1.name = "책1";
//        book1.price = 1000;
//        book1.writer = "저자1";
//        book1.introduceBook();
//
//        Book book2 = new Book();
//        book2.name = "책2";
//        book2.price = 2000;
//        book2.writer = "저자2";
//        book2.introduceBook();
//
//        Book book3 = new Book();
//        book3.name = "책3";
//        book3.price = 3000;
//        book3.writer = "저자3";
//        book3.introduceBook();

//        방법 2
//        for (int i = 1; i < 4 ; i++) {
//            bookAll.name = "책" + i;
//            bookAll.price = 3000 + i;
//            bookAll.writer = "저자" + i;
//            bookAll.introduceBook();
//        }



//        개선하기
        // 매개변수가 3개인 생성자 이용하기.
        Book book1 = new Book("책1", "1000원", "저자1");
        Book book2 = new Book("책2", "2000원", "저자2");
        Book book3 = new Book("책3", "3000원", "저자3");

        book1.introduceBook();
        book2.introduceBook();
        book3.introduceBook();


        Book book4 = new Book("책111111");
        book4.introduceBook();

        Book book5 = new Book("책이름2222", "3000");
        book5.introduceBook();


        Book book6 = new Book();
        book6.introduceBook();



    }
}
