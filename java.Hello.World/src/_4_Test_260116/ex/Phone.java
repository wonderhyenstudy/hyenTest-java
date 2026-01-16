package _4_Test_260116.ex;

public class Phone {

//    실습4
//    Phone` 클래스에서 **static 공유 멤버**를 활용한 설계 구조
//    제조사 이름(manufacturer)
//    모든 인스턴스가 공유해야 할 정보 : 예시)애플, 삼성,
//
//    멤버,
//    접근 지정자 : private
//    1) 모델 :String model
//    2) 폰 넘버 :String phoneNumber
//    3) 생성자는 , 매개변수가 2개인 생성자
//    4) 인스턴스 정보를 출력 메서드 하나 필요함 : printInfo()
//    5) static 메서드를 만들어서,
//    제조사 이름을 변경하는 메서드, : changeManufacturer()
//


    public static String manufacturer = "삼성";
    // static 일때 접근할때는 . 으로 접근해야함
    private String model;
    private String phoneNumber;


    // 매개변수가 2개인 생성자
    public Phone(String model, String phoneNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
//        this(model, phoneNumber);
    }

    // 메인 생성자
    public Phone(String manufacturer, String model, String phoneNumber) {
        Phone.manufacturer = manufacturer;
        this.model = model;
        this.phoneNumber = phoneNumber;
    }


    // 인스턴스 정보를 출력 메서드 하나 필요함 : printInfo()
    public void printInfo() {
        System.out.println("제조사 : " + Phone.manufacturer);
        System.out.println("모델 : " + this.model);
        System.out.println("폰 넘버 : " + this.phoneNumber);
    }

    //반환하는 값이 없을때는 void
    //static 메서드를 만들어서, 제조사 이름을 변경하는 메서드, : changeManufacturer()
    public static void changeManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }
}
