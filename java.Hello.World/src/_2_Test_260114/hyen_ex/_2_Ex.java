package _2_Test_260114.hyen_ex;

import java.util.Scanner;

public class _2_Ex {
    public static void main(String[] args) {
//        예제 3-8 : 배열의 length필드 활용
//        문제: 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 출력하라.

//        1. 키보드로 값 입력받기
//        2. 질문하기
//        3. 배열 선언하기
//        3. 합 변수 선언하기
//        4. for 문으로 배열 넣기
//        5. for 문으로 배열에 저장한 값 저장하기
//        6. 평균값 출력하기

        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 점수를 입력하세요.");
        int[] intArray = new int[5];
        double sum = 0;

        for (int i = 0; i < intArray.length ; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];

        }


        for (int i = 0; i < intArray.length ; i++) {
            System.out.println("입력한 숫자들: " + intArray[i] );
        }

//        System.out.println("입력한 숫자들: " + Arrays.toString(intArray));
        System.out.println("평균값은 : " + sum/intArray.length);
    }
}
