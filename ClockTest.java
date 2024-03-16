package Chapterthree;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Clock clock = new Clock(0, 0,0);

        System.out.println("enter the correct hour:");
        int hour = input.nextInt();
        clock.setHour(hour);

        System.out.println("enter the correct minute:");
        int minute = input.nextInt();
        clock.setMinute(minute);

        System.out.println("enter seconds:");
        int seconds = input.nextInt();
        clock.setSecond(seconds);

        System.out.println(clock.displayTime());
    }
}
