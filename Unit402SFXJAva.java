// Copyright (c) Ac industries All rights reserved  
//
// Created by: Andrew Coxall
// Created on: April 23, 2020
// Average of three inputed numbers

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Unit402SFXJAva {
    
    public static double averageCalculator (double firstNumber, double secondNumber, double thridNumber) {
        double calculatedAverage; 
        double sumOfTheThreeNumbers;
      
        sumOfTheThreeNumbers = firstNumber + secondNumber + thridNumber;
        calculatedAverage = sumOfTheThreeNumbers/3;
        
        return calculatedAverage;
    }
    
    public static void main(String[] args) throws IOException { 

        String numberOne1;
        String numberTwo1;
        String numberThree1;
        double average;
        double numberOne;
        double numberTwo;
        double numberThree;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");

        try {

            numberTwo1 = br.readLine();

            System.out.print ("Enter a number: ");
            numberOne1 = br.readLine();
            
            System.out.print ("Enter a number: ");
            numberThree1 = br.readLine();
            
            numberOne = Double.parseDouble(numberOne1);
            numberTwo = Double.parseDouble(numberTwo1);
            numberThree = Double.parseDouble(numberThree1);
            
            average = averageCalculator(numberOne, numberTwo, numberThree);
            
            System.out.println("The average is: " + average);

        } catch(NumberFormatException nfe) {
            System.err.println("Invalid input!");
        }

        System.out.println();
        System.out.println("Done.");
    }
}
