package _2_Test_260114.ex;

import java.util.Scanner;

public class _12_1_Ex {
    public static void main(String[] args) {
//        응용예시 안내, 복습 및 과제
//        1. (1차원 배열 & 누적 연산)
//        사용자로부터 정수 5개를 입력받아 배열에 저장하세요.
        int[] num = new int[5];
//        그 후 배열에 저장된 모든 숫자의
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 5개를 입력하세요 : ");

        int sum = 0;
        int count = num.length;
        for(int i = 0; i < num.length ; i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
//        **합계(Sum)**와 **평균(Average)**을 계산하여 출력하는 코드를 작성하세요.
        for(int i = 0; i < num.length ; i++){
            System.out.println(num[i]);
        }
        System.out.println("합계(Sum) : " + sum);
        System.out.println("평균(Average) : " + (sum/count));



    }
}
