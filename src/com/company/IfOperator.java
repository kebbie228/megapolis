package com.company;

import java.util.Scanner;

public class IfOperator { /*
         If the light bulb turns on, it will be glow.
         If the temperature is below zero degrees Celsius, the water will be freeze.
         If the user will input a natural number, the program will return a doubled answer and will exit with a status code 0.
         And if the user will input zero, the program will exit with a status code 1.
         Check the number parity, which is a program command line argument.
         The user input two integer numbers as command line arguments. The program output a sum of these numbers.
         If the traffic light is red, you have to stop. If the traffic light is green, you can proceed a movement.
         Else you should wait.
         We have no one, one or two names as arguments of command line. The program will output one of the phrases:
         No one likes this.
         Peter likes this.
         John and Peter like this.
         */
    public static void main(String[] args) {
       if(args.length==0) System.out.println("No one likes this.");
       else if (args.length==1) System.out.printf("%s likes this",args[0]);
       else if (args.length==2)System.out.printf("%s and %s like this",args[0],args[1]);

    }
}