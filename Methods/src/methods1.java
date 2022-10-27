import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.SortedMap;

public class methods1 {
//Вывести слово 'hello'
//Вывести имя пользователя
//Вычислить площадь круга
//Вычислить площадь треугольника
//Вычислить факториал числа
//Дано: номер дня недели. Найти: название дня недели
//Дано: номер дня недели. Напечатать название дня недели
//Определить, является ли число нечетным
//Определить, больше ли первое число второго
//Определить максимальное из двух чисел
//Проверить правильность написания e-mail
//Даны цифры числа, получить само число
//Дан текстовый файл, получить первую строку в нем
//Дана строка, найти порядковые номера букв, входящих в нее
    public static void main(String[] args) {

double s= calculateArea(3.0);
        System.out.println(s);

        System.out.println( factorial(3));
        System.out.println(isOddNumber(3));
        System.out.println(sum(1,2000_000_000l));
        System.out.println(sum("Yar","nton"));
      //  System.out.println(sum(2,3,4,5));
        int[] arr={1,2,3,4};
        System.out.println(sumArr(arr));
    }

    static void printName(String name){
        System.out.println(name);
    }
    static double calculateArea(double r){
       return Math.PI*r*r;
    }
    static double factorial(int n){
        double sum=1;
        for(int i=1;i<=n;i++)
            sum*=i;
        return sum;
    }

    static String getDayOfWeek(int number){
        //switch
        return null;
    }
    static void DayOfWeek(int number){
    }
    //Определить, является ли число нечетным
    static boolean isOddNumber(int number){
        return number%2==1?true:false ;
    }
    //Определить, больше ли первое число второго
static  boolean isFirstBigger(int a,int b){
     return false;
}
static int max(int a,int b){
       return 0;
}
//Проверить правильность написания e-mail
    static boolean isEmailCorrect(String email){
        return false;
    }



    /*
    //Перегрузка методов (overloading)
    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }
     */


    public  static <T extends Number> double sum(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }


    public static String sum(String s1,String s2){
        return s1+s2;
    }
   public static int sum(String s, double a, int... args) {
        int result = 0;
        for (int arg : args) {
            result+=arg;
        }
        return result;
    }
    public static int sumArr(int[] args) {
        int result = 0;
        for (int arg : args) {
            result+=arg;
        }
        return result;
    }
}
