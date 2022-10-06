import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int mark= scanner.nextInt();
        switch(mark){
            case 0:
                System.out.println("peresdacha");
                break;
            case 1:
                System.out.println("not bad");
                break;
            case 2:
                System.out.println("here we go");
                break;
            case 3:System.out.println("Fifty-fifty");
                break;
            case 4:System.out.println("Omg");
                break;
            case 5:System.out.println("Lol");
                break;
            default:
                System.out.println("what you done?");


        }

    }
}
