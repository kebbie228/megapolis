public class Bounced {

        public static void main(String[] args) {

            // прыгающие цифры отлчаются на 1
            //вывести первые 10 4-значных сбалансированных чисел. 1232

            int a = 1000, count = 0;
            while (count < 10) {
                String s = Integer.toString(a);
                int l = s.length();
                boolean flag = true;
                for (int i = 0; i < l - 1; i++) {
                    Character c1 = s.charAt(i);
                    Character c2 = s.charAt(i + 1);
                    int d1 = Integer.parseInt(c1.toString());
                    int d2 = Integer.parseInt(c2.toString());
                    if (Math.abs(d1 - d2) != 1)
                        flag = false;
                }
            if (flag) {
                System.out.println(a);
                count++;
            }
            a++;
        }
    }
}
