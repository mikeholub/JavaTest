public class Room {
    public Carpet theCarpet;
    public Floor theFloor;

    public Room (Carpet carpet, Floor floor) {
        this.theCarpet = carpet;
        this.theFloor = floor;
    }

    public Carpet getTheCarpet() {
        return theCarpet;
    }

    public Floor getTheFloor() {
        return theFloor;
    }

}
