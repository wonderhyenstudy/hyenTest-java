package _4_Test_260116.ex;

public class _2_Ex_PnoneMain {
    public static void main(String[] args) {
//    샘플 제품 3개 등록하고,
//    샘플 제품 3개 정보 출력,

        Phone phone1 = new Phone("모델1", "제품번호1");
        Phone phone2 = new Phone("모델2", "제품번호2");
        Phone phone3 = new Phone("모델3", "제품번호3");

        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

//    제조사 이름 변경 후 조회 까지.
        System.out.println("////////////////// 제조사 변경후 /////////////////////");
//        Phone.manufacturer = "애플";
        Phone.changeManufacturer("애플");
        Phone phone4 = new Phone("아이폰14", "제품번호1");
        Phone phone5 = new Phone("아이폰15", "제품번호2");
        Phone phone6 = new Phone("아이폰16", "제품번호3");
        Phone.manufacturer = "dasgasdg";
        phone4.printInfo();
        phone5.printInfo();
        phone6.printInfo();







    }
}
