package Problem1And2;

public class MyPoint {

    // Attributes

    private int xCoord;
    private int yCoord;
    private int x;
    private int y;

    // Constructors

    public MyPoint() {
        this.xCoord = 0;
        this.yCoord = 0;
    }

    public MyPoint(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    // Getters & Setters

    public int getxCoord() {
        return this.xCoord;
    }

    public int getyCoord() {
        return this.yCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    // Methods

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public String toString() {
        return "(" + xCoord + ", " + yCoord + ")";
    }
}
