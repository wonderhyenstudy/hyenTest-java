package _2_Test_260114.ex;

import java.util.Scanner;

public class _3_Ex {
    public static void main(String[] args) {
//        3)점수에 따라 A~F 등급 출력, if 문 이용해보기.
//        A: 90점이상
//        B: 80점이상
//        C: 70점이상
//        D: 60점이상
//        F: 나머지

        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");

        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.close();


    }
}
