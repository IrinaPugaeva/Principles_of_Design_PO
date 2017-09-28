class Krug {
    double radius;

    Krug (double r) {
        radius = r;
    }
    double area() {
        return Math.PI*radius*radius;
    }
}
public class Circle {
    public static void main(String[] args) {
        Krug mycircle = new Krug(1);

        double area;
        area = mycircle.area();

        System.out.println("The required area of the circle is " + area);
    }
}