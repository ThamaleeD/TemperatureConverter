package com.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheit() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(32,temperatureConverter.celsiusToFahrenheit(0));
    }

    @Test
    void fahrenheitToCelsius() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(0,temperatureConverter.fahrenheitToCelsius(32));
    }

    @Test
    void celsiusToKelvin() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(0,temperatureConverter.celsiusToKelvin(-273.15));
    }


}