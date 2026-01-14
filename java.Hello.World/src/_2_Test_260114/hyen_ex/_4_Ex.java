package _2_Test_260114.hyen_ex;

import java.util.Scanner;

public class _4_Ex {
    public static void main(String[] args) {
//        1. (1차원 배열 & 누적 연산)
//        사용자로부터 정수 5개를 입력받아 배열에 저장하세요.
//        그 후 배열에 저장된 모든 숫자의
//        **합계(Sum)**와 **평균(Average)**을 계산하여 출력하는 코드를 작성하세요.

//        1. 입력받는 함수
//        2. 질문
//        3. 변수선언
//        4. 배열에 저장
//        5. 합계 평균 계산

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요");

        int[] num = new int[5];
        int sum = 0;
        for (int i = 0; i < num.length ; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + sum/num.length);


    }
}
