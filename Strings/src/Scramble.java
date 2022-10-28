public class Scramble {
    //Проверить, можно ли из символов одной строки собрать путем их перестановки другую строку
//Пример: rkqodlw -> world
    public static void main(String[] args) {
        String first="rkqodlw";
        String second="world";
        StringBuilder sb=new StringBuilder(first);

       // int index2=sb.toString().indexOf(second.charAt(0));
       // System.out.println(index2);

        boolean flag=true;
        for(int i=0;i<second.length();i++) {
            int index = sb.toString().indexOf(second.charAt(i));
            if (index == -1) flag = false;
            else sb.delete(index, index + 1);
           // else sb.setCharAt(index, ((Character)second.charAt(i)).toString().toUpperCase().charAt(0));
        }
        System.out.println(flag);
        System.out.println(sb);
        }
    }

