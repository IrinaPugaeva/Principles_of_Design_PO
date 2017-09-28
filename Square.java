class Quadrat {
    double length;

    Quadrat(double l) {
        length = l;
    }
    double area() {
        return length*length;
    }
}
public class Square {
    public static void main(String[] args) {
        Quadrat mysquare = new Quadrat(13);

        double area;
        area = mysquare.area();

        System.out.println("The required area of the square is " + area);
    }
}