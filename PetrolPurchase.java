package Chapterthree;

public class PetrolPurchase {
    private String location;
    private String petrol;
    private int quantity;
    private double price;
    private double discount;
    public PetrolPurchase(String location, String Petrol, int quantity, double price, double discount){
        this.location = location;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
}
  public void setLocation(String location){
        this.location = location;
  }
  public String getLocation(){
        return location;
  }
  public void setPetrol(String petrol){
        this.petrol = petrol;
  }
  public String getPetrol() {
        return petrol;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(double discount) {
        this.discount = price * (discount / 100);
    }

    public double getDiscount() {
        return this.discount;
    }
    public double getPurchaseAmount(double price){
        if(discount < price)throw new insufficientFundException ("insufficient funds pls credit your purse");
        return (quantity * price) - discount;
    }

}

