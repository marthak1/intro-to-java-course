package com.cbfacademy.cars;

import java.util.ArrayList;

import java.util.List;

public class Showroom {
    public List<Car> getCars() {

        // List<Car> listofcars = new ArrayList<Car>();

        List<Car> carValues = new ArrayList<Car>();
        {
            carValues.add(new Car("Volvo", "V40", "blue", 2012));
            carValues.add(new Car(" Porsche", " Panamera", "red", 2009));
            carValues.add(new Car("Audi", "A3", "grey", 2018));

            return carValues;

        }

    }
}

/*
 * public void setMake(String make) {
 * this.make = make;
 * }
 * 
 * public void setModel(String model) {
 * this.model = model;
 * }
 * 
 * public void setColour(String colour) {
 * this.colour = colour;
 * }
 * 
 * public void setYear(int year) {
 * this.year = year;
 * }
 * 
 * }
 */
/*
 * private String make;
 * private String model;
 * private String colour;
 * private int year;
 */
