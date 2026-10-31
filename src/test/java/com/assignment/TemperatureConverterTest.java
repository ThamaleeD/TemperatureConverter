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
        assertEquals(100,temperatureConverter.fahrenheitToCelsius(212));
    }

    @Test
    void celsiusToKelvin() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(273.15,temperatureConverter.celsiusToKelvin(0));
    }


}