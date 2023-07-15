package com.arnoldkk;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scanner  = new Scanner(System.in);

        if (isNumeric(scanner.nextInt())) {
            System.out.println("This is a number");
        }else {
            System.out.println("This is a String");
        }


    }
    private static boolean isNumeric(int input)
    {
        return true;
    }
}
