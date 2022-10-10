import java.util.Scanner;

public class okr {
    public static void main(String[] args) {
 /*
        System.out.println("Input 1 or 0");
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        String s=Integer.toString(x);
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i)== '1') {
                System.out.println("one");
            } else if (s.charAt(i) == '0') {
                System.out.println("zero");
            } else System.out.println("I don't know");
        }
         */
        int k1=0,k2=0;
    for(int i=1;i<=10;i++) {
        if (i % 2 == 0) {
           k1++;
        }
        if (i % 3 == 0) {
            k2++;
        }
    }
        System.out.printf("number of even numbers %d, number of odd numbers %d",k1,k2);


    }}
