package org.fasttrackit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TemperatureTest {


 @Test
    public void testFahrenheitToCelsius() {
  assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0), 0.01);
  assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40.0), 0.01);

 }

 @Test
  public void testCelsiusToFahrenheit() {
  assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0), 0.01);
  assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40.0), 0.01);
 }
}
