public class Triangle {
    private double l1;
    private double l2;
    private double l3;

    public Triangle() {
    }

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public void area(double l1, double l2, double l3) {
        if (l1 + l2 <= l3 || l2 + l3 <= l1 || l1 + l3 <= l2 || l1 <= 0 || l2 <= 0 || l3 <= 0) {
            throw new NotTriangle("非三角形");
        }


        try {
            double p = (l1 + l2 + l3) / 2;
            double s = Math.sqrt((p - l1) * (p - l2) * (p - l3));
            System.out.println(s);
        } catch (NotTriangle e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Triangle Tri1 = new Triangle(3.0, 4.0, 5.0);
        Triangle Tri2 = new Triangle(1.0, 1.0, 2.0);
        Tri1.area(Tri1.getL1(), Tri1.getL2(), Tri1.getL3());
        Tri2.area(Tri2.getL1(), Tri2.getL2(), Tri2.getL3());
    }
}

