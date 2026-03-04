public class Polygon {
    private Point[] points;
    public Polygon(Point[] points) {
        this.points = new Point[points.length];
        for(int i=0; i < points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
    }
    public Polygon(Polygon other) {
        this(other.points);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("Polygon points:");
        for(Point point : points) {
            sb.append(point.toString()).append(" ");

        }
        return sb.toString();
    }
    public String toSvg() {
        StringBuilder svg = new StringBuilder("polygon points=");
        for(Point point: points){
            svg.append(point.getX()).append(",").append(point.getY()).append(" ");
        }
        svg.append(" />");
        return svg.toString();

    }
}
