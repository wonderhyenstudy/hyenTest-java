package _1_test_260113.ex;

import java.util.Scanner;

public class _1_Ex {
    public static void main(String[] args) {

        //실습1
        Scanner scannerH = new Scanner(System.in);
        System.out.println("오늘 저녁 먹고 싶은 메뉴?");
        String dinnerMenu = scannerH.nextLine();

        System.out.println("어디서 먹을까요?");
        String dinnerLoc = scannerH.nextLine();


        System.out.println("저녁 가격은 얼마 예상하나요?");
        int dinnerPri = scannerH.nextInt();


        System.out.println("오늘은" + dinnerMenu + dinnerLoc + "예상가격:" + dinnerPri + "원입니다.");




        scannerH.close();

    }


}
