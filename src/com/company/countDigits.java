package com.company;

public class countDigits {
    public static void main(String[] args) {
        int n=123;
        String s=Integer.toString(n);
        System.out.println(s.length());

        int count= (int) Math.floor(Math.log10(n)+1);
        System.out.println(count);

    }
}
