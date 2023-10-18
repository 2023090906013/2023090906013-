public class Main {
    public static void main(String[] args) {


        rectangle r1 = new rectangle(10,5);
        circle c1 = new circle(5);

        System.out.println("rectangle perimeter="+r1.get_perimeter());
        System.out.println("rectangle area="+r1.get_area());
        System.out.println("circle perimeter="+c1.get_perimeter());
        System.out.println("circle area="+c1.get_area());
    }
}