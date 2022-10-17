public class for1<i> {
    public static void main(String[] args) {
        //в консоли вывести паттерн
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for (int j = 1; j < i; j++)
                System.out.print(j + " ");
                System.out.println();

        }

    }


}
