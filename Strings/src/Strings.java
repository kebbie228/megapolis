public class Strings {

    public static void main(String[] args) {
        //Сравнение строк. Последовательно убирайте комментарии.
      String s1 = "first", s2 = "first";
      StringBuilder sb=new StringBuilder("first");
      String s3=sb.toString();
      System.out.println(s1.compareTo(s2));
        System.out.println(s1==s3);
        String s4="fir";
        System.out.println(s1.contains(s4));
        String left=s1.substring(2,4);
        System.out.println(left);
//Собрать строку и
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        String s5=" "+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s5);
        System.out.printf("Symbol:%c, number:%d%n", c2, (int) c2);

        //String s6=s1+s2;
        StringBuilder sb2=new StringBuilder(s1);
        sb2.append(s2);
        String s6=sb2.toString();
        System.out.println(s5);

       // String s6= s1.concat(s4);
        System.out.println(sb2);
        //Содержит ли строка только цифры
        System.out.println(isOnlyDigits("1234f"));
        //хеш код строки
        System.out.println(s1.hashCode());
        //заменить сивол в строке
        String s7="machine. sdf.";
       // String s8=s7.replace('.','!');
        String s8=s7.replaceFirst("[.]","!");
        System.out.println(s8);
        //удалить все сиволы из выражения
        String s9="{w}dasdwda{{{}}{{}{dafgg}";
        String s10=s9.replaceAll("[{}]","");
        System.out.println(s10);

        //удалить концептуальные пробелы
        s8="      w o r d       ";
        s8=s8.trim();
        System.out.println(s8);
    }
    static boolean isOnlyDigits(String s){
        for(int i=0;i<s.length();i++)
            if(!Character.isDigit(s.charAt(i))) return false;
            return true;
    }
}
