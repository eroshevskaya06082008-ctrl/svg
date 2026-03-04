public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
        Point point = new Point(5, 7);
        System.out.println(point.getX() + " " + point.getY());
        point.setX(7);
        System.out.println(point.getX() + " " + point.getY());
        Point point1 =new Point();

        System.out.println(point1.toString());
        System.out.println(point1.toSvg());
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Segment segment= new Segment(p1, p2);
        System.out.println(segment);


    }
}