package _1_Test_260113.ex;

import java.util.Scanner;

public class _4_Ex {
    public static void main(String[] args) {

//    정수2개 입력 받아 몫과 나머지 출력
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 1 : ");
        int num1 = scanner.nextInt();


        System.out.println("숫자 2 : ");
        int num2 = scanner.nextInt();

        System.out.println("몫(/)" + (num1/num2));
        System.out.println("나머지(%)" + (num1%num2));

        scanner.close();







    }
}
