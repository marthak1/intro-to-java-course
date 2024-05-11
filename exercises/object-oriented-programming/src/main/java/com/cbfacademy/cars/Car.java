/*Java is an Object Oriented Programming Languaguage, 
//Ojects are structures which contains Data in the form of fields and methods()
//This is an example of a Class file called "Car" , a Class sets the blueprint for an Object
//The Fundamental items in O-O-P are;
*Classes
*Objects
*Methods
*Attributes
*/

package com.cbfacademy.cars;

//this is the Class of Car
public class Car {
    // this are the instance fields which sets the attributes of the Car
    // the instance field of a Class must be private while methods and constructors
    // must be public to make them usablethis is called encapsulation
    private String make;
    private String model;
    private String colour;
    private int year;

    /*
     * These are the constructors of the Car object, they are used to innitialize an
     * object
     * or setup its state
     * The default constructors are used to assign default
     * values to the instance fields when the values of the instance fields are not
     * known yet
     * the default constructor, is a constructor without parameter(s)
     * public Car(){
     * String make= "??";
     * String model = "??";
     * String colour = "??";
     * int year = 0;
     * }
     * 
     * and
     * constructors which values are known and needs to be set to what its needs to
     * be
     */
    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        setColour(colour);
        setYear(year);
    }

    // the setters and getters methods() allows us to set the instance field to what
    // we want it to be and get a return value
    // the setters, just like the constructors allow us to set the fields but
    // individually
    // and the getters allows us get a return value
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDetails() {
        return String.format("a %s %s %s from %d", this.colour, this.make, this.model, this.year);

    }

    @Override
    public String toString() {
        return colour + " " + make + " (" + year + ")";
    }

}
