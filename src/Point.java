/**
 * Created by bytegear on 05.10.17.
 */
public class Point {

    private float x,y,z;

    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public static Point add(Point p1, Point p2) {
        return new Point(p1.getX()+p2.getX(),
                         p1.getY()+p2.getY(),
                         p1.getZ()+p2.getZ());
    }

    public static float scalarMult(Point p1, Point p2) {
        return p1.getX()*p2.getX() + p1.getY()*p2.getY() + p1.getZ()*p2.getZ();
    }

}
