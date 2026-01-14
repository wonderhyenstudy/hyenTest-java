package _2_Test_260114.ex;

import java.util.Scanner;

public class _8_Ex {
    public static void main(String[] args) {

//        실습3
//        1)
//        사용자로부터 정수 5개를 입력받아 배열에 저장하고 역순 출력

        Scanner sc1 = new Scanner(System.in);

//      - 크기가 5개인 정수를 요소로 가지는 배열 생성
        int[] nums = new int[5];

        System.out.println("숫자 5개를 입력하세요 : ");

//      - 스캐너를 이용해서, 입력받은 정수를 , 배열에 담기 , 반복문 활용
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc1.nextInt();
        }
//      - 배열에서 꺼내서, 출력하기.
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }













    }
}
