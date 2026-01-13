package _1_test_260113.ex;

import java.util.Scanner;

public class _5_Ex {
    public static void main(String[] args) {

//        실습3
//        1)
//        사용자 나이를 입력받아 성인 여부 판별 (19세 이상이면 true)
//        입력 : 나이 입력:
//        출력 :
//        성인입니까? true/false

        Scanner scanner = new Scanner(System.in);

        System.out.println("나이 입력 : ");
        int age = scanner.nextInt();

        System.out.println("성인입니까? " + (age > 18));

        scanner.close();

    }

}
