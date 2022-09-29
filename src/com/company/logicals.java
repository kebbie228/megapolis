package com.company;

public class logicals {
    public static void main(String[] args) {
        int a=3,b=2,c=3;
        boolean b1=(a==b)&&(a!=c);
        System.out.println(b1);
        boolean b2=(b>a)||(c>a);
        System.out.println(b2);
        boolean b3=(a>=b)&&(b<=c);
        System.out.println(b3);
        boolean b4=(a!=b)||(b!=c);
        System.out.println(b4);
        boolean b5 =(a%2==0) && (b%2==1) && (c<0);
        System.out.println(b5);

        int x1=1,y1=1,x2=3,y2=3;
        boolean bishop=Math.abs(x2-x1)==Math.abs(y2-y1);
        System.out.println(bishop);

        boolean ladya= x1==x2 || y1==y2;
        System.out.println(ladya);

        bolean knight=
    }
}
