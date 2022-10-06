import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
       /* int age=18;
        System.out.println(age<18 ? "denied" : "legalize");

        */

        /*
        System.out.printf("%d, %d, %d, %d\n",(int)'a',(int)'z',(int)'A',(int)'Z');
        System.out.printf("%d, %d, %d, %d\n",(int)'а',(int)'я',(int)'А',(int)'Я');
         */

 /*
        char ch='0';
        String answer =(int)ch>=97&&ch<=122?"lowercase":
                (int)ch>=65&&ch<=90? "uppercase":"not a letter";
        System.out.println(answer);

  */
        /**int a=1,b=11,c=99;
 int max=a>b&&a>c? a:
                b>a && b>c?b:
                c>a && c>b ?c:0;
        System.out.println(max);

         **/
        //угадай число
        int a = (int) (Math.random()*100+1);

        int b=0;
        Scanner scanner=new Scanner(System.in);

        while(a!=b) {
            System.out.println("Enter number");
            b = scanner.nextInt();
            if (a > b) {
                System.out.println("greater");
            }
            else if(a<b){
                System.out.println("less");
            }

        }
        System.out.println("You have got guessed");

    }}