package Chapterthree;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HeartRate heartRate = new HeartRate("Godwin","john",  4,20,2002);

        System.out.println("enter your first name:");
        String firstName = input.nextLine();
        heartRate.setFirstName(firstName);

        System.out.println("enter your lastName:");
        String lastName = input.nextLine();
        heartRate.setLastName(lastName);

        System.out.println("enter your year of birth:");
        int year = input.nextInt();
        heartRate.setYearOfBirth(year);


        System.out.printf("my first name is %s%n, my last name is %s%n, my age is %d, maximum rate is %d,maximum heart rate is %d",heartRate.getFirstName(),heartRate.getLastName(),heartRate.getAgeInYears(),heartRate.targetHeartRange(),heartRate.getMaximumHeartRate());
    }
}
