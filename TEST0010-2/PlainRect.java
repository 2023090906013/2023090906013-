public class PlainRect extends Rect{
    public double startX;
    public double startY;

    public PlainRect() {
        startX=0;
        startY=0;
        width=0;
        height=0;
    }

    public PlainRect(double width, double height, double startX, double startY) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }
    public boolean isInside(double x,double y){
        return (x >= startX && x <= (startX+width) && y < startY && y >= (startY-height));
    }
}
