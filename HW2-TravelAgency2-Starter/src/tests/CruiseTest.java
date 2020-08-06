// COURSE: CSCI1620
// TERM: Fall 2019
// 
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center for help with some of my methods.

package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import triptypes.CabinType;
import triptypes.Cruise;
import triptypes.Flight;
import triptypes.FlightOptionalPackage;

/**
 * Tests the cruise class.
 * @author mattcsukker
 */
public class CruiseTest 
{
	/**
	 * Tolerance when comparing two doubles in our testing methods.
	 */
	public static final double DOUBLE_TOLERANCE = 0.001;
	
	/**
	 * Testing the constructor of the cruise class.
	 */
	@Test
	public void testCruiseConstructor()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
	}
	
	/**
	 * Testing the valid excursion added on.
	 */
	@Test
	public void testCruiseAddExcursionValid()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.addExcursion("Cologne Walking Tour", 3.25);
		assertEquals(1, c.getNumExcursions());
	}
	
	/**
	 * Testing the null excursion added on.
	 */
	@Test
	public void testCruiseAddExcursionNull()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.addExcursion(null, 3.25);
		assertEquals(0, c.getNumExcursions());
	}
	
	/**
	 * Testing the empty excursion added on.
	 */
	@Test
	public void testCruiseAddExcursionEmpty()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.addExcursion("", 3.25);
		assertEquals(0, c.getNumExcursions());
	}
	
	/**
	 * Testing the valid excursion added on with an invalid price.
	 */
	@Test
	public void testCruiseAddExcursionInvalidPrice()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.addExcursion("Cologne Walking Tour", -69.69);
		assertEquals(1, c.getNumExcursions());
	}
	
	/**
	 * Testing the getExursions method.
	 */
	@Test
	public void testCruiseGetExcursions()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		String[] z = new String[10];
		z[0] = "Cologne Walking Tour";
		z[1] = "Dutch Cheese Adventure";
		//assertArrayEquals(z, c.getExcursions());
	}
	
	/**
	 * Testing the getCabinType method with interior cabin.
	 */
	@Test
	public void testCruiseGetCabinTypeInterior()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.setCabinType(CabinType.INTERIOR);
		assertEquals(CabinType.INTERIOR, c.getCabinType());
	}
	
	/**
	 * Testing the getCabinType method with a suite cabin.
	 */
	@Test
	public void testCruiseGetCabinTypeSuite()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.setCabinType(CabinType.SUITE);
		assertEquals(CabinType.SUITE, c.getCabinType());
	}
	
	/**
	 * Testing the getCabinType method with a balcony cabin.
	 */
	@Test
	public void testCruiseGetCabinTypeBalcony()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.setCabinType(CabinType.BALCONY);
		assertEquals(CabinType.BALCONY, c.getCabinType());
	}
	
	/**
	 * Testing the getCabinType method with an ocean view cabin.
	 */
	@Test
	public void testCruiseGetCabinTypeOceanView()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.setCabinType(CabinType.OCEAN_VIEW);
		assertEquals(CabinType.OCEAN_VIEW, c.getCabinType());
	}
	
	/**
	 * Testing the getPrice method.
	 */
	@Test
	public void testCruiseGetPrice()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		assertEquals(1999.00, c.getPrice(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Testing the getDepositAmount method with flights.
	 */
	@Test
	public void testCruiseGetDepositAmountWithFlight()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.setCabinType(CabinType.SUITE);
		Flight details = new Flight("DL", 123, "OMA", "MSP", a, b, 45.00 );
		c.addFlightLeg(details);
		assertEquals(45, c.getDepositAmount(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Testing the getDepositAmount method without flights.
	 */
	@Test
	public void testCruiseGetDepositAmountWithoutFlight()
	{
		Calendar a = Calendar.getInstance();
		a.set(2019, 2, 12, 10, 00);
		Calendar b = Calendar.getInstance();
		b.set(2019, 2, 19, 17, 30);
		Cruise c = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				a, b, 1999.00);
		assertEquals("Rhine Getaway", c.getName());
		assertEquals(7, c.getNumDays());
		assertEquals("Viking Buri", c.getVesselName());
		assertEquals("Basel, Switzerland", c.getHomePort());
		assertEquals(a, c.getDepartureDate());
		assertEquals(b, c.getReturnDate());
		c.setCabinType(CabinType.SUITE);
		Flight details = new Flight("DL", 123, "OMA", "MSP", a, b, 45.00 );
		c.addFlightLeg(details);
		assertEquals(45, c.getDepositAmount(), DOUBLE_TOLERANCE);
	}
}
