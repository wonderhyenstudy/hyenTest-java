package _2_Test_260114.ex;

public class _12_2_Ex {
    public static void main(String[] args) {
//        2. (2차원 배열 & 조건문)
//        4x4 크기의 2차원 정수 배열을 만드세요.
//        배열 행열
//        1차 :
//            0 1 2 3
//
//        2차 : 2x2
//            00 01 02 03
//            10 11 12 13
//            20 21 22 23
//            30 31 32 33



        int[][] arr = new int[4][4];
//        이중 반복문을 사용하여 행의 인덱스와 열의 인덱스가 같을 때(i == j)는
//        1을 저장하고, 다를 때는 0을 저장하세요.
        int number = 0;

        for(int i = 0; i < 4 ; i++) {
            for(int j = 0; j < 4 ; j++) {
//                arr[i][j] = number++;
                if ( i == j ) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int[] row : arr) {
            for(int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
//        그 후 배열의 형태를 출력하세요. (대각선 줄 긋기)
//        for(int i = 0; i < 4 ; i++) {
//            for(int j = 0; j < 4 ; j++) {
//
//            }
//        }

//        for (int n : arr) { // 향상된 for , 배열의 모든 요소를 순회.
//            // nums 배열에서, 요소를 하나씩 꺼내서 이용하기.
//            System.out.println(n);
//        }
//        힌트) 출력 print()
//                - 줄바꿈을 할 때 : System.out.println();


    }
}
