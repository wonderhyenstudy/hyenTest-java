package _1_test_260113.ex;

import java.util.Scanner;

public class _3_Ex {
    public static void main(String[] args) {
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




        scannerGender.close();
    }
}
