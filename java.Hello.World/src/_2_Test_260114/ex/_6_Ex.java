package _2_Test_260114.ex;

public class _6_Ex {
    public static void main(String[] args) {
//        3)1~50 사이에서 7의 배수만 출력하되, 30이 넘으면 종료
//        힌트 for 문 활용

        for (int i = 1; i <= 50; i++) {
            if (i > 30) break;
            if (i % 7 != 0) continue;

            System.out.println(i);
        }


    }
}
