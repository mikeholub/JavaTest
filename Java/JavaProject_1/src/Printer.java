import java.util.SortedMap;

public class Printer {
    private int tonerLevel;
    private int qtyOfPages;
    private boolean duplex;

    public Printer (int level, int pages, boolean duplex) {
        this.tonerLevel = level;
        this.qtyOfPages = pages;
        this.duplex = duplex;
    }

    public void FillToner (int amount) {
        tonerLevel += amount;
        if (tonerLevel>100) {
            tonerLevel = 100;
        }
        System.out.println("Toner was filled. New level: " + tonerLevel);
    }

    public void PrintPage (int pages) {
        int pagestoPrint = pages;
        if (duplex) {
            pagestoPrint = pages/2 + pages%2;
            qtyOfPages +=pagestoPrint;
            System.out.println(pagestoPrint + " pages were printed");
        }
        else {
            qtyOfPages += pages;
            System.out.println(pages + " pages were printed");
        }
    }
}