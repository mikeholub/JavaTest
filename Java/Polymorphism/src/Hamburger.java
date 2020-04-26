public class Hamburger {
    private String name;
    private String bread;
    private String meat;
    float price = 5;

    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;

    public void setName(String name) {
        this.name = name;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public Hamburger (String bread, String meat, float price, String name) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void PriceCalc (float price) {
        float finalPrice = price;
        System.out.println("Base Price:" + price + "$");

        if (lettuce) {
            finalPrice += 0.1f;
            System.out.println("Lettuce: 0.1$");
        }
        if (tomato) {
            finalPrice += 0.2f;
            System.out.println("Tomato: 0.2$");
        }
        if (carrot) {
            finalPrice += 0.3f;
            System.out.println("Carrot: 0.3$");
        }
        if (cheese) {
            finalPrice += 0.4f;
            System.out.println("Cheese: 0.4$");
        }
        System.out.println("TOTAL PRICE: " + Math.round(finalPrice*100.0)/100.0 + "$");
    }
}