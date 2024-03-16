package Chapterthree;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        if(price < 0.0)throw
            new IllegalArgumentException("low account balance");
        this.price = price;
    }



    public void setDiscountPrice(double discountPrice){
         discountPrice = price *( discountPrice / 100);
        price -= discountPrice;
    }

    public double getPrice() {
        return this.price;
    }
}
