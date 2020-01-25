package ca.bcit.comp1510.lab11;

public class Transaction {
    
    private Item[] cart;
    private double totalPrice;
    private int itemCount;
    
    public Transaction(int cartSize) {
        cart = new Item[cartSize];
        totalPrice = 0.0;
        itemCount = 0;
    }
    
    public void addToCart(String name, double price, int quant) {
        if (itemCount >= cart.length) {
            increaseSize();
        }
        cart[itemCount++] = new Item(name, price, quant);
        totalPrice += price;
    }
    
    public void addToCart(Item item) {
        if (itemCount >= cart.length) {
            increaseSize();
        }
        cart[itemCount++] = item;
        totalPrice += item.getItemPrice();
    }
    
    public void arrCpy(Item[] src, Item[] dst) {
        // copy items from src array into dst array
        // helper for increaseSize()
        int len = src.length;
        for (int i = 0; i < len; i++) {
            dst[i] = src[i];
        }
    }
    
    public void increaseSize() {
        int sizeIncrement = 3;
        Item[] newCart = new Item[itemCount + sizeIncrement];
        arrCpy(cart, newCart);
        cart = newCart;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public int getCount() {
        int len = itemCount;
        int count = 0;
        for (int i = 0; i < len; i++) {
            count += cart[i].getQuantity();
        }
        return count;
    }
    
    public String toString() {
        String res = "CART DETAILS: \n";
        int len = itemCount;
        for (int i = 0; i < len; i++) {
            res += (i+1) + ". " + cart[i].getItemName() + ", " + 
            cart[i].getItemPrice() + ", " + cart[i].getQuantity() + "\n";
        }
        res += "Total Price: " + getTotalPrice() + "\n";
        res += "Num Items in Cart: " + itemCount + "\n";
        res += "Total Item Count: " + getCount() + "\n";
        return res;
    }
    
}
