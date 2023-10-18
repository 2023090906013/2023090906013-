public class TEST {
    public static void main(String[] args) {


        PlainRect PR1 = new PlainRect(20, 10, 10, 10);
        System.out.println("该矩形的周长是" +PR1.perimeter());
        System.out.println("该矩形的面积是" +PR1.area());
        if(PR1.isInside(25.5,13)){
            System.out.println("该点在矩形内");
        }else {
            System.out.println("该点不在矩形内");
        }
    }
}