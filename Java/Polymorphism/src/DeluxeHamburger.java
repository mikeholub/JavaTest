public class DeluxeHamburger extends Hamburger {
    private boolean chips;
    private boolean drinks;

    public DeluxeHamburger (boolean chips, boolean drinks, float price) {
        super("extra", "super beef", price);
        this.chips = chips;
        this.drinks = drinks;
    }

    @Override
    public void PriceCalc(float price) {
        float finalPrice = price;
        System.out.println("Base Price:" + price + "$");

        if (chips) {
            finalPrice += 0.7f;
            System.out.println("Chips: 0.7$");
        }

        if (drinks) {
            finalPrice += 0.8f;
            System.out.println("Drinks: 0.8$");
        }
        System.out.println("TOTAL PRICE: " + Math.round(finalPrice*100.0)/100.0 + "$");
    }
}
