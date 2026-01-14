package _1_Test_260113;

import java.util.Scanner;

public class _4_Test_Scanner {
    public static void main(String[] args) {

        // 스캐너를 사용하는 도구를 한 줄 문장으로 통으로 기억.
        Scanner scanner = new Scanner(System.in);
//
        System.out.println("1. 이름 입력 : "); // 콘솔에 이름 입력 대기.
        // 이름 입력 후, 엔터 치는 순간
        // 이름 입력
        // next(), 이름 입력 내용만 가져오고, enter 남겨둠.
        String name = scanner.next();

        // 나이 입력
        System.out.println("2. 나이 입력 : "); // 콘솔에 이름 입력 대기.
        int age = scanner.nextInt();

        // 출력 해보기.
        System.out.println("이름 : " + name + ", 나이는 : " + age);

//        scanner.close();
//


//실습1
        Scanner scannerMenu = new Scanner(System.in);
        System.out.println("오늘 저녁 먹고 싶은 메뉴?");
        String dinnerMenu = scannerMenu.nextLine();

        System.out.println("어디서 먹을까요?");
        String dinnerLoc = scannerMenu.nextLine();


        System.out.println("저녁 가격은 얼마 예상하나요?");
        int dinnerPri = scannerMenu.nextInt();


        System.out.println("오늘은" + dinnerMenu + dinnerLoc + "예상가격:" + dinnerPri + "원입니다.");


//        scannerMenu.close();

//        정수 두 개를 입력받아 합과 평균 출력
//        정수1 (숫자,int):
//        정수2 (숫자,int):
//        출력 :
//        합: [] ,
//        평균 []

//        실습2
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("정수1 (숫자,int): ");
        int num1 = scannerNum.nextInt();

        System.out.println("정수2 (숫자,int): ");
        int num2 = scannerNum.nextInt();

        int total1 = num1 + num2;
        int total2 = total1 / 2;

        System.out.println("합: " + total1);
        System.out.println("평균: " + total2);

        scannerNum.close();


//        실습3
//        char 타입(하나의 문자만 의미)으로 성별 입력 받고 출력
//        ex) char gender =
//        성별(M/F) :
//        출력 :
//        입력한 성별은: M

        Scanner scannerGender = new Scanner(System.in);
        System.out.println("성별(M/F): ");
//        String gender = scannerGender.nextLine();
        char gender = scannerGender.next().charAt(0);

        System.out.println("입력한 성별은:" + gender);



        scanner.close();
        scannerNum.close();
        scannerGender.close();




    }
}
