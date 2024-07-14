package gr.aueb.cf.ch16.homework.p2;

public class Rectangle extends AbstractShape implements  IRectangle{
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return Math.round(2 * (width + height));
    }
}
