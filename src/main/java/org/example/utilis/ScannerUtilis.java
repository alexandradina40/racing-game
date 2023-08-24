package org.example.utilis;

import java.util.Scanner;

public class ScannerUtilis
{
    static final Scanner scaner=new Scanner(System.in);
    public static int nextIntandMoveToNextLine()
    {
        int integer=scaner.nextInt();
        scaner.nextLine(); // to move the next line
        return integer;
    }
    public static String nextLine()
    {
        return scaner.nextLine();
    }
}
