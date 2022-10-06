import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int a1 = (int) (Math.random() * 100 + 1);
        int b1 = 0;
        Scanner scanner = new Scanner(System.in);
        while (a1 != b1) {
            System.out.println(" Enter a number : ");
            b1 = scanner.nextInt();
            if (a1 > b1) System.out.println(" Next greater ");
            else System.out.println(" Next less ");
        }
        System.out.println("You victory!!!");
        //https://www.kaznu.kz/content/files/news/folder23098/%D0%97%D0%B0%D0%B4%D0%B0%D1%87%D0%BD%D0%B8%D0%BA%20%D0%90%D0%B1%D1%80%D0%B0%D0%BC%D1%8F%D0%BD%D0%B0.pdf
    }
}
