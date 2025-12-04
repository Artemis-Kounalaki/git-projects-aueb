package gr.aueb.cf.cf9.ch6;

/**
 * Πινακεσ με διαφορετικό αριθμό στηλων ,
 * δηλ αλλο μέγεθοσ σε καάθε γραμμη
 */
public class JaggedArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[10];

        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}
