package com.pluralsight;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Vehicle vehicle1 = new Vehicle(1, "Hyundai Venue", "Mirage Green", 10000, 27000.0);
        Vehicle vehicle2 = new Vehicle(2, "Hyundai Sonata", "Baby Blue", 1000, 20000.0);
        Vehicle vehicle3 = new Vehicle(3, "Hyundai Santa Cruz", "Black", 1400, 32000.0);

        System.out.println(vehicle1.getVehicleId());

    }
}
