package circle;

public class Cylinder extends Circle{
    protected double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                " height=" + height +
                " color=" + color +
                " volume=" + getVolume() + '}';

    }
}
