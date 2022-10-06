package com.company;

public class BitWiseHW {
    /*Задание 1. Обнулить бит в нулевом разряде числа N. Остальные
        биты не должны изменить свое значение. Вывести на консоль в двоичном виде.*/
    public static void main(String[] args) {
     byte a=0b1101;
      //byte b= (byte) (a>>1<<1);
     // byte b= (byte) (a&0b1110);
       /*Задание 2. Вывести на консоль 2 в степени n. Для вычисления ис-
         пользовать только побитовые операции.*/
        //byte n=3;
       // byte b= (byte) (1<<n);

        /*Задание 3. Установить i-й бит числа N равным 1. Вывести результат
        на консоль в двоичном виде.*/
        byte i=1;
       // byte b=(byte) (1<<i)|a);;
        String s = String.format("%4s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.println(s);
    }
}
