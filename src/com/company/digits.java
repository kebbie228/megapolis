package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        //1
        int x=123;
        int hundreds=x/100;
        int tens=x/10%10;
        int ones=x%10;
        System.out.printf("Hundreds: %d,tens:%d,ones:%d\n",hundreds,tens,ones);
        int b=ones*100+tens*10+hundreds;
        System.out.println(b);
        //2
        String s=Integer.toString(x);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        b=Integer.parseInt(sb.toString());
        System.out.println(b);



    }
}
