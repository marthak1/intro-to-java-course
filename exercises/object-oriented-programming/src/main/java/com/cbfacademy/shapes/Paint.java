package com.cbfacademy.shapes;

public class Paint extends Shape {
    // Inside the `shapes` package, create a class `Paint` with the following
    // members:
    private double coverage;

    Paint(double coverage) {
        // - constructor that accepts a parameter representing the number of square feet
        // per gallon this paint can cover
        this.coverage = coverage;

    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    // - returns the amount of paint (measured in gallons) needed to paint a given
    // shape
    double getAmount(Shape shape) {

        return coverage / 2;

    }

    @Override
    public double getArea() {
        return this.getAmount(null);
    }
}

/*
 * getArea();
 * // return coverage;
 * Shape surfaceArea = new Shape() {
 * 
 * @Override
 * public double getArea() {
 * coverage = paint.getAmount(paint);
 * return coverage;
 * }
 * };
 * double expectedAmount;
 * double calculatedAmount = paint.getAmount(shape);
 * return calculatedAmount;
 * 
 * 
 * }
 * 
 * @Override
 * public double getArea() {
 * 
 * throw new UnsupportedOperationException("Unimplemented method 'getArea'");
 */
