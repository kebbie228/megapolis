public class Funny1 {
    public static void main(String[] args) {
  /*int n=1;

        for(int i=0;i<8;i++){
            String left=String.format("%d*%d=",n,n);
            System.out.printf("%22s%d\n",left,(long)n*n);
            n=n*10+1;
        }

   */
        String c = "5";
        String s = "";
        for (int i = 0; i < 8; i++) {
            s += c;
           // System.out.println(s);
            String left=String.format("%s*%s=",c,s);
           // System.out.printf("%22s%d\n",left,(long)Long.parseLong(s)*5);
            System.out.println(left+(long)Long.parseLong(s)*5);

        }
    }
}
