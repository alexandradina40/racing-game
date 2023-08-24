package org.example.utilis;

import java.util.Scanner;

public class ScannerUtilis
{
    Scanner scaner=new Scanner(System.in);
    public int nextIntandMoveToNextLine()
    {
        int integer=scaner.nextInt();
        scaner.nextLine(); // to move the next line
        return integer;
    }
    public String nextLine()
    {
        return scaner.nextLine();
    }
}
