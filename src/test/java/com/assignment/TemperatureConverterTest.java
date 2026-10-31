package com.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheit() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void fahrenheitToCelsius() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(100.0, temperatureConverter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    void celsiusToKelvin() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(273.15, temperatureConverter.celsiusToKelvin(0), 0.001);
    }
}