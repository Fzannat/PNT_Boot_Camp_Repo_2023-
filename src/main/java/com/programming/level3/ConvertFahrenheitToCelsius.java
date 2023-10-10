package com.programming.level3;

import java.util.Scanner;

public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        double tempInFahrenheit = scanner.nextDouble();

        double tempInCelsius = (tempInFahrenheit - 32)*(5.0/9.0);

        System.out.println("Temperature in fahrenheit is " + tempInFahrenheit + "\u00B0" + "F");
        System.out.println("Temperature isn celsius is " + tempInCelsius + "\u00B0" + "C");

    }

}
