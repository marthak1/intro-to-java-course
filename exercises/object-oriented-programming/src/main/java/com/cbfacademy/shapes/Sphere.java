package com.cbfacademy.shapes;

public class Sphere extends Shape {
    /*
     * In the same package,
     * create a concrete class`Sphere`that extends`Shape`:
     */

    private double radius;

    public Sphere(double radius) {
        // - constructor
        this.radius = radius;
        super.name = "Sphere";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (4 * Math.PI * (Math.pow(radius, 2)));

        // - overrides the base method. The value is given
        // by the formula (`4` * `𝛑` * (`radius`<sup>2</sup>))

    }

}
