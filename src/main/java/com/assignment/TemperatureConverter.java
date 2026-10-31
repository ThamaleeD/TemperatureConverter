package com.assignment;


public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {

        double fahrenheit = (celsius * 9 / 5) + 32;
        return 1;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return 1;
    }

    public double celsiusToKelvin(double celsius) {

        double kelvin = celsius + 273.15;
        return 1;
    }
    public static void main(String[] args) {

    }
}



