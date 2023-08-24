package org.example;

public class Vehicle
{
    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;
    boolean damage;
    String Color;



    public double accelerate(double speed,double durationInHours)
    { // Ferrari is accelerating with 100km/h for 1h
        System.out.println(name+ " is accelerating with "+ speed + " for " + durationInHours + " h");
        double distance=speed*durationInHours;

        totalTraveledDistance=totalTraveledDistance+distance;

        System.out.println("Total distance for vehicle "+ name +":" + totalTraveledDistance);

        double usedFuel=distance*mileage/100;
        fuelLevel=fuelLevel-usedFuel;
        System.out.println("Remaining fuel  for vehicle "+ name +":" + fuelLevel);

        return distance;
    }


}
