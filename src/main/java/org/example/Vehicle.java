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

        if(fuelLevel<=0 | damage)
        {
            System.out.println("You cannot accelerate.");
            return 0;
        }

        if(speed>maxSpeed)
            {
                System.out.println("Max speed exceeded.");
                return 0;
            }
        else if (speed==maxSpeed)
            {
                System.out.println("Careful, max speed reached.");
            }
        else
            {
                System.out.println("Valid speed entered.");
            }

        System.out.println(name+ " is accelerating with "+ speed + " for " + durationInHours + " h");
        double distance=speed*durationInHours;

        totalTraveledDistance=totalTraveledDistance+distance;

        System.out.println("Total distance for vehicle "+ name +":" + totalTraveledDistance);
        double milleage_multiplaier=1;
        if(speed>120)
        {
            milleage_multiplaier=speed/100;
        }

        double usedFuel=distance*mileage*milleage_multiplaier/100;
        fuelLevel=fuelLevel-usedFuel;
        System.out.println("Remaining fuel  for vehicle "+ name +":" + fuelLevel);

        return distance;
    }


}
