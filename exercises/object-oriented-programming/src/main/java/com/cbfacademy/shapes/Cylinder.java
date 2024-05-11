package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    /*
     * In the same package,
     * create a concrete class`Cylinder`that extends`Shape`:
     */
    double height;
    double radius;

    Cylinder(double radius, double height) {
        // - constructor
        this.height = height;
        this.radius = radius;
        super.name = "Cylinder";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (height * Math.PI * (Math.pow(radius, 2)));
        // - overrides the base method. The value is given by the formula (`height` *
        // `𝛑` * (`radius`<sup>2</sup>)).
    }

}
