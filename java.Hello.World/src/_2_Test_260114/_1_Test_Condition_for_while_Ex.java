package _2_Test_260114;

import java.util.Scanner;

public class _1_Test_Condition_for_while_Ex {
    public static void main(String[] args) {
//        * `for (int i = 0; i < n; i++)` : 가장 일반적인 반복 구조
//        * `while (true)` : 무한 루프 구조, 내부에서 `break` 필수
//        * `break` : 조건 충족 시 반복문을 빠져나감
//        * `continue` : 이후 문장을 무시하고 다음 반복으로 넘어감
//
//        ### 6. 구조 설명 (비유)
//
//        * `for`문은 **정해진 횟수의 계단**을 오르는 것
//        * `while`문은 **조건이 참일 때만 계속 도는 바퀴**
//        * `do-while`은 **최소 한 바퀴는 돌고 나오는 회전목마**
//        * `break`는 **비상탈출구**, `continue`는 **잠깐 쉬고 다음 스텝으로 점프**
//
//        ### 7. 실무 어떻게 활용 되는지
//
//        * 리스트/배열 순회, 사용자 입력 반복
//        * 특정 조건 충족 시 조기 종료 (`break`)
//        * 무의미한 경우 건너뛰기 (`continue`)
//
//        기본예시
//        1)
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//        2)
//        1~10 중 홀수만 출력
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) continue;
//            System.out.println(i);
//        }
//        3)
//        1~10 중 6에서 멈추기
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.println(i);
        }


    } // main
} // class
