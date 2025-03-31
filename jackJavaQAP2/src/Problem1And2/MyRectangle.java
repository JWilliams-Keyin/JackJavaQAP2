package Problem1And2;

public class MyRectangle {

    // Attributes

    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters

    public int getArea() {
        int length = Math.abs(bottomRight.getxCoord() - topLeft.getxCoord());
        int width = Math.abs(bottomRight.getyCoord() - topLeft.getyCoord());
        return length * width;
    }

    public int getPerimeter() {
        int length = Math.abs(bottomRight.getxCoord() - topLeft.getxCoord());
        int width = Math.abs(bottomRight.getyCoord() - topLeft.getyCoord());
        return (length * 2) + (width * 2);
    }

    // Methods

    public String toString() {
        return
                "Top-left point: " + topLeft +
                ", Bottom-right point: " + bottomRight +
                ", Area: " + getArea() +
                ", Perimeter: " + getPerimeter();
    }
}