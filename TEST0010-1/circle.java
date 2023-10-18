public class circle implements Perarea{
    private double r;

    public circle() {
    }


    @Override
    public double get_area() {
        return Math.PI*r*r;
    }

    @Override
    public double get_perimeter() {
        return Math.PI*2*r;
    }


    public circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

}
