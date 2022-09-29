package com.company;

public class chars {
    public static void main(String[] args) {
        char c='a';//utf=-8;
        int n=(int)c;
        System.out.println(n);
        int l1=181;
        char c1=(char)l1;
        System.out.println(c1);

        char c2= (char) (c+1);
        System.out.println(c2);

        int count='z'-'a';
        System.out.println(count+1);
    }
}
