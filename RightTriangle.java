public class RightTriangle {
    private double a;
    private double b;

    public RightTriangle(double base, double height) {
        a = height;
        b = base;
    }

    public double hypotenuse() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
