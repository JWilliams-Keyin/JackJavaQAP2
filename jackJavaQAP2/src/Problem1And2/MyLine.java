package Problem1And2;

public class MyLine {

    // Attributes

    private MyPoint begin, end;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int x;
    private int y;

    // Constructors

    public MyLine(int x1, int y1, int x2, int y2) {
        x1 = 0;
        y1 = 0;
        x2 = 1;
        y2 = 0;
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters & Setters

    public MyPoint getBegin() {return begin;}

    public MyPoint getEnd() {return end;}

    public void setBegin(MyPoint begin) {this.begin = begin;}

    public void setEnd(MyPoint end) {this.end = end;}

    public int getBeginX() {return x1;}

    public int getBeginY() {return y1;}

    public void setBeginX(int x) {this.x = x;}

    public void setBeginY(int y) {this.y = y;}

    public int getEndX() {return x2;}

    public int getEndY() {return y2;}

    public void setEndX(int x) {this.x = x;}

    public void setEndY(int y) {this.y = y;}

    public int[] getBeginXY() {return new int[]{this.x, this.y};}

    public int[] getEndXY() {return new int[]{this.x, this.y};}

    public void setBeginXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setEndXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Methods

    public double getLength() {
        MyPoint distance = new MyPoint();
        return distance.distance(x2, y2);
    }

    public double getGradient() {
        double xDiff = x2 - x1;
        double yDiff = y2 - y1;

        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "MyLine[begin = (" + x1 + ", " + y1 + ") end = (" + x2 + ", " + y2 + ")]";
    }
}
