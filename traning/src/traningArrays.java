import java.util.Random;
import java.util.Scanner;

public interface traningArrays {
    static int rows = 6, cols = 6;
    static int[][] arr = new int[rows][cols];

    public static void main(String[] args) {
        //в консоли вывести паттерн
/*
    int n = 11;
        for (int i = 1; i <= n; i++) {
        for(int j=0;j<n-i;j++)
           System.out.print(" ");
        for (int j = 1; j < i; j++)
            System.out.print(j + " ");
        System.out.println();
   }
*/
        /*
        int n = 11;
        for (int i = 0; i<=n; i++) {
            //for(int j=0;j<n-i;j++)
           //System.out.print(" ");
            for (int j = 1; j<n-i; j++)
                System.out.print(j+" ");
            System.out.println();
        }

         */
/*
        int n = 5;
        for (int i = 0; i<=n; i++) {
            for(int j=0;j<n-i;j++)
            System.out.print(" ");
            for (int j = 1; j<=i; j++)
                System.out.print(j+" ");
            System.out.println();
}

        for (int i = n; i>=0; i--) {
            for(int j=0;j<n-i;j++)
            System.out.print(" ");
            for (int j = 1; j < i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

 */

/*
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = j + 1 + i * cols;
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }

 */



/*
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                arr[i][j] = i % 2 == 0 ? j + 1 + i * cols : cols - j + i * cols;
            System.out.print(arr[i][j]+" ");}
        }

 */
        /*
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
                i++;
                if (i == rows) {
                    j++;
                    while (i != 0) i--;
                }
            }

        }
*/
    }
    static void fillorder() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                arr[i][j] = j + 1 + i * cols;
        }


    }

    static void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = j + 1 + i * cols;
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }

    }



}
