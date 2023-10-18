public class rectangle implements Perarea{
    private double l1;
    private double l2;

    @Override
    public double get_area(){
        return l1*l2;
    }

    @Override
    public double get_perimeter() {
        return (l1+l2)*2;
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
    public rectangle() {
    }

    public rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }
}

