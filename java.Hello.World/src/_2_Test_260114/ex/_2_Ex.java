package _2_Test_260114.ex;

import java.util.Scanner;

public class _2_Ex {
    public static void main(String[] args) {
//        2) switch 문으로 메뉴 선택
//        메뉴 번호에 따라서, 음식 메뉴 출력 하기.
//                입력 화면은, 메뉴 화면
//        1. 김밥 2. 국밥 3.칼국수 4.국수 등.
//        예시
//        case 1 김밥, 본인 원하는 메뉴 추가. 출력해보기.


        Scanner sc = new Scanner(System.in);

        System.out.println("메뉴 번호를 입력해주세요 : ");
        int menu = sc.nextInt();

        switch (menu){
            case 1:
                System.out.println("김밥");
                break;
            case 2:
                System.out.println("국밥");
                break;
            case 3:
                System.out.println("칼국수");
                break;
            case 4:
                System.out.println("국수");
                break;
            default:
                System.out.println("골라골라");

        }
        sc.close();




    }
}
