package _3_Test_260115.ex;

import java.io.IOException;
import java.util.Scanner;

public class _1_Ex {
    public static void main(String[] args) {
//        실습1
//        숫자 입력 예외 처리,
//        사용자가 문자를 입력했을 때 예외 처리
//        (스캐너 도구를 이용하고, 숫자를 가져와서 사용하는 구조이고,
//                거기에 사용자가, 문자를 입력했을 때 처리하는 경우)
//
//        힌트) try-catch` 구문을 이용하기.
//        예외처리 방식 1) 큰범위로 합니다.
//        catch (Exception e) {

//        1. 스캐너로 입력값 받는다
//        2. 문자 입력 한다
//        3. 변수 저장
//        4. 예외처리 날린다

        Scanner scanner = new Scanner(System.in);
//        int num = 0;

        try {
            System.out.println("숫자를 입력해주세요");
            int num = scanner.nextInt();
            System.out.println("입력한 숫자 : " + num);

        } catch (Exception e) {
            // 넣었는지 아닌지 어떻게 검증하지????
            // 숫자인데 문자를 넣은걸 어떻게 검증하지??
            System.out.println("웁스!! 숫자를 입력하지 않았습니다.");
            e.printStackTrace();//오류가 발생한 이력을 조사 할 수 있다.

        } finally {
            System.out.println("아하! 입력은 했네요. 수고하셨습니다.");
            scanner.close();
        }
    }
}
