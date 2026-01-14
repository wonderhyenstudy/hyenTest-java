package _1_Test_260113.ex;

import java.util.Scanner;

public class _2_Ex {
    public static void main(String[] args) {
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
    }

}
