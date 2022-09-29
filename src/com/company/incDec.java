package com.company;

public class incDec {
    public static void main(String[] args) {
       int x,y;
        x=1;
        y=x++; //y=x; x=x+1;
        System.out.printf("x:%d, y:%d\n",x,y);
        x=1; y=++x;
        //x=x+1; y=x;
        System.out.printf("x:%d, y:%d\n",x,y);

        x=1; y=x--;
        System.out.printf("x:%d, y:%d\n",x,y);
        x=1; y=--x;
        System.out.printf("x:%d, y:%d\n",x,y);

        x=1; y=0; y+=++x;
        System.out.printf("x:%d, y:%d\n",x,y);
        //x=x+1; y=y+x;
        x=1; y=0; y-=x++;
        System.out.printf("x:%d, y:%d\n",x,y);

        x=1;y=0;y+=++x + x;
        System.out.printf("x:%d, y:%d\n",x,y);

        x=1; y=0; y+=x++ + ++x;
        System.out.printf("x:%d, y:%d\n",x,y);

        x=1; y=0; y+=--x + x++;
        System.out.printf("x:%d, y:%d\n",x,y);

        x=1; y=0; y+=x++ + ++x;
        System.out.printf("x:%d, y:%d\n",x,y);




    }
}
