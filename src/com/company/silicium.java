package com.company;

public class silicium {
    public static void main(String[] args) {
        int x=12;
        String s=Integer.toBinaryString(x);
        System.out.println(s);
        s="1100";
        int b=Integer.parseInt(s,2);
        System.out.println(b);

        x=15;
        s=Integer.toHexString(x);
        System.out.println(s.toUpperCase());

        s="FF";
        b=Integer.parseInt(s,16);
        System.out.println(b);

        s="1010";
        b=Integer.parseInt(s,2);
        s=Integer.toHexString(b);
        System.out.println(s);

    }
}
