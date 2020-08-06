// COURSE: CSCI1620
// TERM: Fall 2019
// 
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center for help with some of my methods.

package tests;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

import triptypes.AllInclusiveResort;
import triptypes.Flight;
import triptypes.FlightOptionalPackage;

/**
 * Testing class for AllInclusiveResort.
 * @author mattcsukker
 */
public class AllInclusiveResortTest
{
	/**
	 * Used to compare the two doubles whilst testing.
	 */
	public static final double DOUBLE_TOLERANCE = 0.001;
	
	/**
	 * Tests the constructor.
	 */
	@Test
	public void testAllInclusiveResortConstructor()
	{
		String [] test = new String[3];
		test[0] = "Meals at Timber";
		test[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		test[2] = "Mud Therapy Session";
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, test );
	}
	
	/**
	 * Tests the getAmenities.
	 */
	@Test
	public void testAllInclusiveResortGetAmenities()
	{
		String [] test = new String[3];
		test[0] = "Meals at Timber";
		test[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		test[2] = "Mud Therapy Session";
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, test);
		assertEquals("Meals at TimberMurder Mystery Evening at Arbor Lodge MansionMud Therapy Session", 
				a.getAmenities());
	}
	
	/**
	 * Tests the getAmenities when null.
	 */
	@Test
	public void testAllInclusiveResortGetAmenitiesNull()
	{
		String [] test = new String[1];
		test[0] = null;
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, test );
		assertEquals("null, ", a.getAmenities());
	}
	
	
	/**
	 * Tests the getGuestsPerRoom when valid.
	 */
	@Test
	public void testAllInclusiveResortGetGuestsPerRoomValid()
	{
		String [] test = new String[3];
		test[0] = "Meals at Timber";
		test[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		test[2] = "Mud Therapy Session";
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, test );
		assertEquals(2, a.getGuestsPerRoom());
	}
	
	/**
	 * Tests the getGuestsPerRoom when invalid.
	 */
	@Test
	public void testAllInclusiveResortGetGuestsPerRoomInvalid()
	{
		String [] test = new String[3];
		test[0] = "Meals at Timber";
		test[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		test[2] = "Mud Therapy Session";
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				-69, 175.00, test );
		assertEquals(1, a.getGuestsPerRoom());
	}
	
	/**
	 * Tests the getPrice method.
	 */
	@Test
	public void testAllInclusiveResortGetPrice()
	{
		String [] test = new String[3];
		test[0] = "Meals at Timber";
		test[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		test[2] = "Mud Therapy Session";
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, test );
		assertEquals(175.00, a.getPrice(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Tests the getDepositAmount method without a flight.
	 */
	@Test
	public void testAllInclusiveResortGetDepositAmountWithoutFlight()
	{
		String [] test = new String[3];
		test[0] = "Meals at Timber";
		test[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		test[2] = "Mud Therapy Session";
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, test );
		assertEquals(0, a.getDepositAmount(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Tests the getLodgingCost method.
	 */
	@Test
	public void testAllInclusiveResortGetLodgingCost()
	{
		String [] test = new String[3];
		test[0] = "Meals at Timber";
		test[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		test[2] = "Mud Therapy Session";
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, test );
		assertEquals(350, a.getLodgingCost(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Tests the toString method.
	 */
	@Test
	public void testAllInclusiveResortToString()
	{
		//FINISH
		String [] test = new String[3];
		test[0] = "Meals at Timber";
		test[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		test[2] = "Mud Therapy Session";
		AllInclusiveResort a = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, test );
		a.toString();
		assertEquals("", a.toString());
	}
	
}
