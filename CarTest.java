package Chapterthree;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car car1 = new Car("Benz", "2010", 5000.0);
        Car car2 = new Car("volvo", "2009", 2000.0);

        System.out.println("enter the price for car1:");
        double price1 = input.nextDouble();
        car1.setPrice(price1);

        System.out.println("enter discount for car1:");
        double discount1 = input.nextDouble();
        car1.setDiscountPrice(discount1);


        System.out.println("enter the price for car2");
        double price2 = input.nextDouble();
        car2.setPrice(price2);

        System.out.println("enter discount for car2");
        double discount2 = input.nextDouble();
        car2.setDiscountPrice(discount2);

        System.out.printf("%.2f%n%.2f",car1.getPrice(),car2.getPrice());
    }
}
