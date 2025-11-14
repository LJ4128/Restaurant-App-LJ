public class Pizza {
    private final double BASE_PRICE = 4.99;
    private final String[] pizzaSize = {"Small 8\"", "Medium 12\"", "Large 16\"", "Extra Large 20\""};
    private String size;
    private String toppings;
    private boolean extraCheese;
    private boolean stuffedCrust;
    private double price;

    public Pizza() {
        size = pizzaSize[0];
        toppings = "None";
        extraCheese = false;
        stuffedCrust = false;
        price = BASE_PRICE;

    }

    public Pizza(String size, String toppings, boolean extraCheese, boolean stuffedCrust, double price) {
        this.size = size;
        this.toppings = toppings;
        this.extraCheese = extraCheese;
        this.stuffedCrust = stuffedCrust;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public String getToppings() {
        return toppings;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isStuffedCrust() {
        return stuffedCrust;
    }

    public double getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setStuffedCrust(boolean stuffedCrust) {
        this.stuffedCrust = stuffedCrust;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

