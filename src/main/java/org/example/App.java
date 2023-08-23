package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Car carReference = new Car(); // cream obiect nou , real, constructor
        carReference.name="Ferrari";
        carReference.maxSpeed=300;
        carReference.fuelLevel=60;
        carReference.mileage=12.5;
        carReference.totalTraveledDistance=0;
        carReference.damage=true;
        carReference.Color="red";
        carReference.doorCar=1;
        System.out.println("Properties of car "+ carReference.name); // sout
        System.out.println("Car speed " + carReference.maxSpeed);
        System.out.println("Fuel level "+ carReference.fuelLevel);
        System.out.println(carReference); // hash code ul obiectului

      Car car2= new Car();
      car2.name="Renault";
      car2.fuelLevel=70;
      car2.totalTraveledDistance=100;

      System.out.println("Proprties of car2"+ car2.name);
      System.out.println("Fuel level "+ car2.fuelLevel);
      System.out.println("Total Distance of car2 " + car2.totalTraveledDistance);

      carReference.name="Audi";
    }
}
