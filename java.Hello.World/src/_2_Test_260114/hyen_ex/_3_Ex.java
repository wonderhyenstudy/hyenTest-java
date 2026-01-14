package _2_Test_260114.hyen_ex;

public class _3_Ex {

    public static int[] makeArray() {
        int[] temp = new int[4];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
        return temp;
    }

    public static void main(String[] args) {
//        예제 3-11 : 배열 리턴
//        문제: 일차원 정수 배열을 생성하여 리턴하는 makeArray()를 작성하고,
//        이 메소드로부터 배열을 전달받는 프로그램을 작성하라.
//        결과 : 0 1 2 3
//        1. makeArray() 생성
//            1-1. 배열 선언 4개
//            1-2. for문 이용 배열돌리기
//        2. 메소드 불러오기
//            2-1. 담아놓을 변수 선언
//            2-2

        int[] intArray;
        intArray = makeArray();
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }

    }
}
