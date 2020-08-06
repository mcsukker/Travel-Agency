// COURSE: CSCI1620
// TERM: Fall 2019
// 
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center for help with some of my methods but I did not use any help
// for this class.

package tests;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import triptypes.Flight; 

/**
 * Testing the Flight class' methods.
 * @author mattcsukker
 */
public class FlightTest 
{
	/**
	 * Tolerance when comparing two doubles in our testing methods.
	 */
	public static final double DOUBLE_TOLERANCE = 0.001;
	
	/**
	 * Testing the constructor of the flight class.
	 */
	@Test
	public void testFlightConstructor()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 3, 11, 6, 25);
		Calendar b = Calendar.getInstance();
		b.set(2019, 3, 11, 7, 14);
		Flight c = new Flight("DL", 123, "OMA", "ATL", a, b, 45.00);
	}
	
	/**
	 * Tests getPrice method.
	 */
	@Test
	public void testFlightGetPrice()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 3, 11, 6, 25);
		Calendar b = Calendar.getInstance();
		b.set(2019, 3, 11, 7, 14);
		Flight c = new Flight("DL", 123, "OMA", "ATL", a, b, 10.00);
		c.getPrice();
		assertEquals(10.00, c.getPrice(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Tests toString method.
	 */
	@Test
	public void testFlightToString()
	{
		//fix
		Calendar a = Calendar.getInstance();
		a.set(2019, 3, 11, 6, 25);
		Calendar b = Calendar.getInstance(); 
		b.set(2019, 3, 11, 7, 14);
		Flight c = new Flight("DL", 123, "AIR", "POR", a, b, 45.00);
		assertEquals("DL 123 Departs: AIR at 06:25 04-11-2019; Arrives POR at 07:14 04-11-2019", c.toString());
	}
}
