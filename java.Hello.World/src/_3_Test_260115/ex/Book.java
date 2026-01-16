package _3_Test_260115.ex;

// 클래스를 객체로 생성해서 사용할꺼야
public class Book {
//    1) 클래스 설계(정의)
//    클래스명 : Book
//    멤버 변수 1) name 2) price 3) writer
//    기능 :책소개 메서드 이름 : introduceBook()
//    기능 내부에는 , 현재 책의 이름과, 가격과 저자를 소개하는 출력 기능이 있습니다.
//    2)클래스 사용(샘플 책3권 만들기)
//    3) 메인 메서드가 있는 클래스에서,
//    책 3권의 소개 기능을 구현 하기.
    String name;
    String price;
    String writer;

    // 기본생성자
//    public Book(){}
    // 기본생성자자에 기본 값 넣기
    public Book(){
        // 반복적인 코드 사용
//        this.name = "제목미정";
//        this.price = "가격미정";
//        this.writer = "저자미정";

        //this를 이용한 메서드 체이닝
        this("제목미정", "가격미정", "저자미정");
    }

    // 메인 생성자 : 다 풀어줘야함
    // 매개변수가 3개인 생성자
    public Book(String name, String price, String writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    // 오버로딩 구현 : 똑같은 생성자를 여러개 만든다.
    // 생성자의 내용 : 매개변수의 갯수, 타입, 순서 중 적어도 하나는 달라야 한다.
    // 매개변수가 1개인 생성자
    public Book(String name) {
        this(name, "가격미정", "저자미정");
    }

    public Book(String name, String price) {
//        this.name = name;
//        this.price = price;
        this(name, price, "저자미정");
    }

    void introduceBook() {
        System.out.println("책의 이름 : " + this.name);
        System.out.println("책의 가격 : " + this.price + "원");
        System.out.println("책의 저자 : " + this.writer);
        System.out.println();
    }
}
