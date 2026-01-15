package _3_Test_260115.ex;

public class Starbucks {
//    실습3
//    스타벅스 메뉴 개발하는 클래스 작성.
//    1) 설계 클래스 : StarCoffeeMenu
//    멤버, 변수
//    메뉴이름 : menuName (String)
//    사이즈 : size (String)
//    핫?아? : isHot (boolean)

//    - 생성자 메뉴만 정하면, 사이즈 기본 : "Tall" , 핫 : 기본 true
//    - 생성자, 메뉴와 사이즈 따로 정하면, 기본 : 핫
//    - 생성자, 메뉴, 사이즈, 핫 여부 따로 주문
//
//    - 메서드는 , 주문한 내역을 보여주는 메서드 : showMenu
//    예시) 주문한 메뉴 : 디카페인커피
//    사이즈 : 그란데
//    핫 : true
//    주문 내역서 출력.

//    1. 변수선언
//    2. 생성자 생성
//    3. 각 메서드 생성
    String menuName;
    String size;
    boolean isHot;
    String name;

    // 기본생성자
    public Starbucks() {
        this("미정", "미정", true, "손");
    }
    // - 매개변수 1개 : 생성자 메뉴만 정하면, 사이즈 기본 : "Tall" , 핫 : 기본 true
    public Starbucks(String menuName) {
        this(menuName, "Tall", true, "손");
    }
    // - 매개변수 2개 : 생성자, 메뉴와 사이즈 따로 정하면, 기본 : 핫
    public Starbucks(String menuName, String size) {
        this(menuName, size, true, "손"); //이미 만들어진 다른 생성자를 호출하는 코드입니다.
    }
    // - 매개변수 3개 : 생성자, 메뉴, 사이즈, 핫 여부 따로 주문
    // 메인 생성자(전체 생성자) : 다 풀어줘야함
    public Starbucks(String menuName, String size, boolean isHot, String name) {
//        this(menuName, size, isHot);
        this.menuName = menuName; //필드에 값을 직접 저장하는 코드입니다
        this.size = size;
        this.isHot = isHot;
        this.name = name;
    }

    // 주문한 메뉴 출력
    void StarbucksMenu() {
        System.out.println("==========="+ this.name + " 님. 주문하신 메뉴입니다===============");
        System.out.println("주문한 메뉴 : " + this.menuName );
        System.out.println("사이즈 : " + this.size);
        if (this.isHot == true) {
            System.out.println("핫 : " + "HOT(true)");
        } else {
            System.out.println("핫 : " + "ICE(false)");
        }
        System.out.println("=========================================");
        System.out.println();

    }




}
