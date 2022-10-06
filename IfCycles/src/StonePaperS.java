import java.util.Scanner;

public class StonePaperS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String x1="";


        while(true){
            int robot= (int) (Math.random()*3) +1;
            switch (robot){
                case 1: x1="stone";break;
                case 2: x1="paper";break;
                case 3: x1="Scissor";break;
            }

            System.out.println("Input a number: 1-stone, 2-paper,3-scissor");
            int x2= scanner.nextInt();
            System.out.println("My chose is "+x1);
            if(robot==x2) System.out.println("draw");
            else if((robot==1 && x2==3) || (robot==2 &&x2==1) || (robot==3 && x2==2) ){
                System.out.println("You loose");}
            else System.out.println("You won");





        }
    }
}
