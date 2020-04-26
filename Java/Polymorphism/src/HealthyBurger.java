public class HealthyBurger extends Hamburger {
    boolean rice;
    boolean potato;

    public HealthyBurger (String meat, float price, boolean rice, boolean potato) {
        super("rye bread roll", meat, price);
        this.rice = rice;
        this.potato = potato;
        this.price = price;
    }

    @Override
    public void PriceCalc (float price) {
        float finalPrice = price;
        System.out.println("Base Price:" + price + "$");

        if (rice) {
            finalPrice += 0.5f;
            System.out.println("Rice: 0.5$");
        }

        if (potato) {
            finalPrice += 0.6f;
            System.out.println("Potato: 0.6$");
        }
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