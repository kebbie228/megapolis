import java.util.Scanner;

public class okr {
    public static void main(String[] args) {

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
        /*
    for(int i=1;i<=10;i++) {
        if (i % 2 == 0) {
            System.out.print(i + " ");
        }
    }
        System.out.println();
        for(int i=1;i<=10;i++) {
        if (i % 3 == 0) {
            System.out.print(i + " ");
        }
    }

         */
    }}
