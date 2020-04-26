public class Floor {
    private double width;
    private double length;

    public Floor (int width, int length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public void recreation (int qty) {
        getArea();
    }

    public double getArea () {
        return this.width * this. length;
    }

}
