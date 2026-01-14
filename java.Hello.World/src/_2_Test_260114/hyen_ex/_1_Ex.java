package _2_Test_260114.hyen_ex;

import java.util.Scanner;

public class _1_Ex {
    public static void main(String[] args) {
//        예제 3-1: for문을 이용하여 1부터 10까지 합 출력하기
//        문제: for문을 이용하여 1부터 10까지 덧셈으로 표시하고 합을 출력하라.
        int num = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if(i <= 9){
                System.out.print(i+"+");
                sum += i;
            } else if(i==10) {
                sum += i;
                System.out.print(i+"="+sum);
            }

        }

        System.out.println("///////////////////////////////////");

//        예제 3-4 : 2중 중첩을 이용한 구구단 출력하기
//        문제: 2중 중첩된 for문을 이용하여 구구단을 출력하는 프로그램을 작성하라.

        for (int i = 1; i < 10 ; i++) {
            for (int j = 1; j < 10 ; j++) {
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print("\t");
            }
            System.out.println();
        }


//        예제 3-7 : 배열 선언 및 생성
//        문제:양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
        Scanner scanner = new Scanner(System.in);
        
        int[] intArray = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력하세요 : ");

        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            if(intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("가장 큰 수는 : " + max);
        scanner.close();
        
        



    }
}
