package _2_Test_260114.hyen_ex;

public class _5_Ex {
    public static void main(String[] args) {
//        2. (2차원 배열 & 조건문)
//        4x4 크기의 2차원 정수 배열을 만드세요.
//        이중 반복문을 사용하여 행의 인덱스와 열의 인덱스가 같을 때(i == j)는
//        1을 저장하고, 다를 때는 0을 저장하세요.
//        그 후 배열의 형태를 출력하세요. (대각선 줄 긋기)
//        힌트) 출력 print()
//                - 줄바꿈을 할 때 : System.out.println();
//        1. 변수선언
//        2. for 문
//        if(i == j) {
//        1
//        } else {
//        0
//        }
//        3. 배열 형태 출력

        int[][] intArray = new int[4][4];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length ; j++) {
                if(i == j) {
                    intArray[i][j] = 1;
                } else {
                    intArray[i][j] = 0;
                }
            }
        }
        // 방법1
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = 0; j < intArray.length ; j++) {
//                System.out.print(intArray[i][j] + " ");
//            }
//            System.out.println();
//
//        }
        // 방법2
        for (int[] row : intArray){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }



    }
}
