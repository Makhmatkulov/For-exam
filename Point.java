public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static void main(String[] args) {
        Point point = new Point(1.0, 2.0, 3.0);

        System.out.println("X qiymati: " + point.getX());
        System.out.println("Y qiymati: " + point.getY());
        System.out.println("Z qiymati: " + point.getZ());

        point.setX(4.0);
        point.setY(5.0);
        point.setZ(6.0);

        System.out.println("Yangi X qiymati: " + point.getX());
        System.out.println("Yangi Y qiymati: " + point.getY());
        System.out.println("Yangi Z qiymati: " + point.getZ());
    }
}