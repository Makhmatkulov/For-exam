public class RightAngledTriangle {
    private double sideA;
    private double sideB;
    private double sideC;public RightAngledTriangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = Math.sqrt(a * a + b * b);
    }
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
        this.sideC = Math.sqrt(sideA * sideA + sideB * sideB);
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
        this.sideC = Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public double getSideC() {
        return sideC;
    }

    public double calculateArea() {
        return 0.5 * sideA * sideB;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public static void main(String[] args) {
        RightAngledTriangle triangle = new RightAngledTriangle(3.0, 4.0);

        System.out.println("Side A: " + triangle.getSideA());
        System.out.println("Side B: " + triangle.getSideB());
        System.out.println("Side C: " + triangle.getSideC());

        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}