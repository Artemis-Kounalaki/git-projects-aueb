package gr.aueb.cf.cf9.ch6;

/**
 * Ορίζει ενα 2d πίνακα και κάνει populate τον πίνακα
 * 2Ds array -> γραμμή, στλήλη
 */
public class ArrayTwoDim {
    public static void main(String[] args) {
        int[][] grid = new int[2][3];
        int[][] grid2 = {{1,2,3},{4,5,6}};

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;

        for( int i=0; i<grid.length; i++){
            for( int y=0; y<grid[i].length;y++){
                System.out.print(grid[i][y] +" ");
            }
            System.out.println();
        }
        //ή enhanced for
        for (int[] row : grid) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}




