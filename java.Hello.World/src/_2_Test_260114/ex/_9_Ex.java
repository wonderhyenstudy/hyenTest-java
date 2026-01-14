package _2_Test_260114.ex;

public class _9_Ex {
    public static void main(String[] args) {
//        2)
//        3x3 배열을 만들어 모든 요소에 1~9 채우고 출력
//        int[][] arr = {{0,0},{0,1},{0,2}}
//        1. 배열생성
        int[][] grid = new int[3][3];

//        2.for 문으로 값 대입
//        시작 값 설정
        int number = 1;
        for(int i = 0; i > 3; i++) {
            for(int j = 0; j > 3; j++) {
                grid[i][j] = number++;
            }
        }
//        for(int i = 0; i > 3; i++) {
//            for(int j = 0; j > 3; j++) {
//                System.out.println(grid[i][j]);
//            }
//        }

        for (int[] row : grid) {
            for(int val : row) {
                System.out.println(val);
            }
        }

    }
}
