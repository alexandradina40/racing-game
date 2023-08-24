package org.example;

import org.example.utilis.ScannerUtilis;

import java.util.Scanner;

public class Game
{

    public void start()
    {

        System.out.println("Welcome to the racing-game");
        int player_count=getPlayerCountFromUser();
        System.out.println("Player count : "+player_count);
        String player_vehicle_name=get_VehicleName_FromUser();
        System.out.println("Vehicle name : "+player_vehicle_name);
    }

    private int getPlayerCountFromUser()
    {
        System.out.println("Please enter number of players");
       // Scanner scanner=new Scanner(System.in); // to read from keyboard
        return ScannerUtilis.nextIntandMoveToNextLine(); // we will read an int value
    }

    private String get_VehicleName_FromUser()
    {
        System.out.println("Please enter vehicle name ");
       // Scanner scanner1=new Scanner(System.in);
        return ScannerUtilis.nextLine(); // we will read a string
    }
}
