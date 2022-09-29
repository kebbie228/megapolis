package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class enums {
    public static void main(String[] args) {
        Arrows left=Arrows.LEFT;
        System.out.println(left);
        System.out.println(left.ordinal());

        Colors colorBus=Colors.YELLOW;
        System.out.printf("color of the bus is %s\n",colorBus);

        int day=4;
        System.out.printf("today is %s",Days.values()[day-1]);
    }
}
enum Arrows{LEFT,RIGHT,UP,DOWN};
enum Colors{BLACK,WHITE,GRAY,RED,GREEN,BLUE,YELLOW}
enum Days{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}