package _2_Test_260114.ex;

public class _7_Ex {
    public static int[] getDate(){
        return new int[] {5, 10, 15};
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        for (int n : nums){
            System.out.println(n);
        }

        int[][] grid ={{1,2}, {3,4}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "");
            }
            System.out.println();
        }


//        int[][] grid = {{1,2}, {3,4}};
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                System.out.print(grid[i][j] + " ");
//            }
//            System.out.println();
//        }
    }


}
