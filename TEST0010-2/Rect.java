public class Rect {
     double width;
     double height;

    public Rect() {
        width=10;
        height=10;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double area(){
        return width*height;
    }
    public double perimeter(){
        return (width+height)*2;
    }
}
