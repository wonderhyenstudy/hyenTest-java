package _3_Test_260115.ex;

import java.util.Scanner;

public class _2_Ex {
    public static void main(String[] args) {
//        예제 3-12 : 0으로 나누기 시 예외 발생으로 응용프로그램이 강제 종료되는 경우
//        문제: 두정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램 코드이다 .
//        사용자가 나누는 수에 0 을 입력하면 자바 플랫폼에 의해
//        예외가 발생하여 프로그램이 강제 종료된다.

//        1. 스캐너로 입력값 받는다
//        2. 입력하세요 문구 출력
//        3. 변수 선언 2개
//        4.에러 try catch

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        try{
            System.out.println("두 정수를 입력해 주세요.");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            int divide = num1 / num2;
            System.out.println("입력한 숫자는 : " + num1 + " , " + num2);
            System.out.println("나눈몫은 : " + divide);
        } catch (Exception e){
            num2 = 0;
            System.out.println("0 으로는 나눌수가 없어!!");
        } finally {
            System.out.println("잘했다! 잘했다! 잘했다!");
            scanner.close();
        }



    }
}
