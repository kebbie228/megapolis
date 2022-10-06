import java.util.Scanner;

public class CycleWhile3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        

        String name="1";
        while(!name.isBlank()){System.out.println("Enter name:");
            name = x.nextLine();
            System.out.println("hi "+name);
        };
    }
}
