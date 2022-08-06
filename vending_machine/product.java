package vending_machine;

public class product {
    private int price;
    private String productName;

    public product(int price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String displayProduct() {
        return "Product: " + this.productName + " Price: " + this.price;
    }

}
