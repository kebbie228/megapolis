package com.company;

public class CycleWhile {
    public static void main(String[] args) {
        //Кузнечик прыгает на 1 см, затем на 2, на 3 и т.д.
        // Через сколько прыжков он взберется на травинку высотой 50 см?
        int jump=1;
        int dist=0;
        int count=0;
        while(dist<50){System.out.println(dist);
        dist+=jump;
        jump+=1;
        count++;

        }
        System.out.println(count);

    }
}
