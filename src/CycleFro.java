import java.util.Random;

public class CycleFro {
    public static void main(String[] args) {
       /* for(int i=9;i>0;i--){
            System.out.println(i);}
      for (int i = 0; i < 10; i++){i+=i;}


        Random random = new Random();
        for (int i = 0; i < 10; i+=2){ int n = random.nextInt(10);
        System.out.print(n+" ");}

        for(int i=0;i<10;i++){ if(i==4)continue;
            System.out.print(i+" ");}

        for(int i=0;i<10;i++){ if(i==6)break;
            System.out.print(i+" ");}
        for(int i=0,j=9;i<10;i++,j--){
            System.out.print(i+" "+j+" ");

            System.out.println();*/

            for(int i=0;i<10;i+=2){
                System.out.print(i+" ");
                i--;
                System.out.print(i+" ");}
        }
    }
