import java.util.Scanner;

public class okr2 {
    /*Контрольная работа:
            1. Вывести паттерн в виде треугольника заданной высоты:
            *
            *  *
            *    *
            ********
            2. Номиналы белорусских монет: 1,2,5,10,20,50.
    Дана сумма сдачи: 51..99 копеек.
    Выдать сдачу минимальным количеством монет.
     */

    public static void main(String[] args) {

        int n= 4;
        char x='*';
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <=i; j++){
                if(i==n)
                    System.out.print(x);
                else {
                    if (j > 0 && j<i) System.out.print(" ");
                    else System.out.printf("%c", x);
                }
            }
            System.out.println();
        }

    }
}
