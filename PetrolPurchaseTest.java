package Chapterthree;

import java.util.Scanner;

public class PetrolPurchaseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PetrolPurchase petrolPurchase = new PetrolPurchase("null","null",10, 1500.0,10.0);
        System.out.println("enter the price of the petrol:");
        int price = input.nextInt();
        petrolPurchase.setPrice(price);

        System.out.println("how many litres of petrol do you want to buy :");
        int quantity = input.nextInt();
        petrolPurchase.setQuantity(quantity);

        System.out.println("Enter the discount price: ");
        double discount = input.nextDouble();
        petrolPurchase.setDiscount(discount);

        System.out.printf("%.2f%n%d%n%.2f",petrolPurchase.getPrice(),petrolPurchase.getQuantity(),petrolPurchase.getDiscount());
    }
}
