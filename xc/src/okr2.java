import java.util.Random;
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

        int n = 5;
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
         /*
        Random random=new Random();

        int change= random.nextInt(51,99);
        System.out.println(change);
      int min=50,k=0;
      int one=0,two=0,five=0,ten=0,twenty=0,fifty=0;
  for(int i=0;i<10;i++){
      if(change==50){ one =1;
          System.out.println("one="+one+" two="+two+" five="+five+" ten="+ten+" twenty="+twenty+" fifty="+fifty);
          return;
      }
      for(int j=0;j<1;j++) {
          if (min +10<=change) {
              min += 10;
              ten++;
          } else if (min +5<=change) {
              min += 5;
              five++;
          } else if (min +2<=change) {
              min += 2;
              two++;
          } else if (min +1<=change){
              min += 1;
              one++;
          }
      }
          if (ten == 2) {
              twenty = ten;
              ten = 0;
          }
          if (five == 2) {
              ten = five;
              five = 0;
          }
          if (one == 2) {
              two = one;
              one = 0;
          }
  }
        System.out.println("one="+one+" two="+two+" five="+five+" ten="+ten+" twenty="+twenty+" fifty="+fifty);


         */

    }
}
