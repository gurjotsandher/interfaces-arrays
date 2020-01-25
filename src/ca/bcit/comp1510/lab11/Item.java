package ca.bcit.comp1510.lab11;


public class Item {
    private final String itemName;
    private final double itemPrice;
    private final int quantity;
    
    public Item(String name, double price, int quant) {
        itemName = name;
        itemPrice = price;
        quantity = quant;
    }
    
    public Item(String name, double price) {
        itemName = name;
        itemPrice = price;
        quantity = 1;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public double getItemPrice() {
        return itemPrice;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String toString() {
        return "Item(name=" + itemName + ", price=" + itemPrice + ", quantity=" + quantity + ")";
    }
}
