package _2_Test_260114.ex;

import java.util.Scanner;

public class _5_Ex {
    public static void main(String[] args) {
//        2)사용자로부터 양수(+)만 입력받고 음수(-)가 입력되면 종료
//        힌트 do-while 문 활용


        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");




        do {
            int num = sc.nextInt();

            if(num < 0){
                System.out.println("음수! 안돼!!!");
                break;
            } else {
                System.out.println(num);
                System.out.println("양수입니다. 패스!!");
            }
        } while (true);

    }
}
