package _2_Test_260114.ex;

import java.util.Scanner;

public class _1_Ex {
    public static void main(String[] args) {
//        if else 사용
//        1) 나이를 입력받아 65세 이상이면 "노년층" 출력
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력해주세요 : ");

        int age = sc.nextInt();

        if (age >= 65) {
            System.out.println("노년층");
        } else {
            System.out.println("넌누구냐");
        }

        sc.close();
    }
}

