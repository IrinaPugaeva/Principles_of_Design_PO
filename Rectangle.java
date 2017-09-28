class Rect {
    double length;
    double width;

    Rect(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length*width;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rect myrectangle = new Rect(14,32);

        double area;
        area = myrectangle.area();

        System.out.println("The required area of the rectangle is " + area);
    }
}
