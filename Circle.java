package gr.aueb.cf.ch16.homework.p2;

public class Circle extends AbstractShape implements ICircle {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }
}