public class Point {
    private int x;
    private int y;

    public Point (){

    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public double distance () {
        double result;
        result = Math.sqrt(x*x + y*y);
        return result;
    }

    public double distance (int x, int y) {
        double result;
        result = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return result;
    }

    public double distance (Point another) {
        double result;
        result = Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
        return result;
    }
}
