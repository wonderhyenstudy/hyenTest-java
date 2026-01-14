package _1_Test_260113.ex;

import java.util.Scanner;

public class _6_Ex {
    public static void main(String[] args) {

//        삼항 연산자 이용, (조건식) ? 참 : 거짓
//        점수가 60점 이상이면 "합격" 아니면 "불합격"
//        입력 : 점수 입력:
//        출력 :
//        합격/불합격 입니다.

        Scanner scanner = new Scanner(System.in);

        System.out.println("점수 입력 : ");
        int score = scanner.nextInt();

        System.out.println("당신은 " + ((score >= 60) ? "합격" : "불합격") + " 입니다.");


        scanner.close();


    }
}
