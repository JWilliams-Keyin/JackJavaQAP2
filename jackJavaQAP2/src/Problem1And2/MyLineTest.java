package Problem1And2;

public class MyLineTest {
    public static void main(String[] args) {

        // First Constructor

        MyLine line1 = new MyLine(0, 0, 1, 0);

        System.out.println(line1);

        // Second Constructor With Getters & Setters

        MyLine line2 = new MyLine(new MyPoint(1,2), new MyPoint(3, 4));

        System.out.println(line2);
    }
}
