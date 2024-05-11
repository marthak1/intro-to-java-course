package com.cbfacademy;

import java.util.List;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    public static void main(String[] args) {
        // creating an object of Showroom and instantiaing it
        Showroom showroom = new Showroom();
        List<Car> cars = showroom.getCars();
        // showroom.getCars();

        System.out.println(showroom.getCars());
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

// Creating an object of the class Showroom
/*
 * Showroom Obj1 = new Showroom();
 * Showroom Obj2 = new Showroom();
 * Showroom Obj3 = new Showroom();
 * 
 * // setting the attributes
 * Obj1.setMake("Volvo");
 * Obj1.setModel("V40");
 * Obj1.setColour("blue");
 * Obj1.setYear(2012);
 * 
 * Obj2.setMake("Porsche");
 * Obj2.setModel(" Panamera");
 * Obj2.setColour("red");
 * Obj2.setYear(2009);
 * 
 * Obj3.setMake("Audi");
 * Obj3.setModel("A3");
 * Obj3.setColour("grey");
 * Obj3.setYear(2003);
 */
