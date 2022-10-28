public class okr2tra {
    /*Контрольная работа:
            1. Вывести паттерн в виде треугольника заданной высоты:
            *
            *  *
            *    *
            ********
            2. Номиналы белорусских монет: 1,2,5,10,20,50.
    Дана сумма сдачи: 51..99 копеек.
    Выдать сдачу минимальным количеством монет.


      for (int i = 1; i <= n; i++) {
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for (int j = 1; j < i; j++)
                System.out.print(j + " ");
                System.out.println();

        }
     */
    public static void main(String[] args) {
        int n = 5;
        // char x='*';

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            if (i == n)
                for (int j = 1; j < n*2; j++) System.out.print("*");
            else{
            for (int j = 1; j <= i; j++) {
                if (i == n) System.out.print("*" + " ");
                else {
                    if (j == 1) System.out.print("*");
                    else if (j == i) System.out.print("*" );
                    else System.out.print(" ");
                    System.out.print(" ");
                }
            }
            }
            System.out.println();
        }
    }
}
