public class BitWise {
    public static void main(String[] args) {
        byte a=0b1100;
        byte b=0b1010;
       // byte c= (byte) (a&b);
        //byte c= (byte) (a|b);
       // byte c= (byte) (~a);
       // byte c= (byte) (a^b);
       // byte c= (byte) (~a&b);
        //byte c= (byte) (~(a|b));
     // byte c = (byte)(a|b&a);
        //byte c = (byte)(a&b&a);
        //byte c = (byte)(a>>1&b);
        //byte c = (byte)(a>>1|b>>1);
       // a = 2; byte c = (byte)(1<<a>>1);
        String s = String.format("%4s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.println(s);
    }
}
