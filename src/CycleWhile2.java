import java.util.Scanner;

public class CycleWhile2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a;
        do {
            System.out.println("Enter a:");
            a = x.nextInt();
            System.out.println(a);
        }
        while(a>0);

}
}
