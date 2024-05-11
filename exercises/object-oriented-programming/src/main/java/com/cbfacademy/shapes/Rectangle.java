package com.cbfacademy.shapes;

//the subclass of the abstract class Shape can either be declared abstract or implement the abstract getArea() method
public class Rectangle extends Shape {
    // In the same package, create a concrete class `Rectangle` that extends
    // `Shape`:

    private double length;
    private double width;

    Rectangle(double length, double width) {
        // - constructor
        setLength(length);
        setWidth(width);
        super.name = "Rectangle";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;

        // - overrides the base method. The value is given
        // by the formula (`length` * `width`)
    }

}
