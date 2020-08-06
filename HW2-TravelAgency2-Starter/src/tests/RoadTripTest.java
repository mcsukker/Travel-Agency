// COURSE: CSCI1620
// TERM: Fall 2019
// 
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center for help with some of my methods.

package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import triptypes.RoadTrip;
import triptypes.VacationPackage;

/**
 * Test the RoadTrip class.
 * @author mattcsukker
 */
public class RoadTripTest
{
	/**
	 * Used to compare two doubles.
	 */
	public static final double DOUBLE_TOLERANCE = 0.001;
	
	/**
	 * Used to test the constructor.
	 */
	@Test
	public void testRoadTripConstructor()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		assertEquals(2, a.getHotelStars());		
	}
	
	/** 
	 * Used to test the getHotelStars method.
	 */
	@Test
	public void testRoadTripGetHotelStars()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setHotelStars(3);
		assertEquals(3, a.getHotelStars());		
	}
	
	/**
	 * Used to test the getHotelStars method when the rating is above 5 stars.
	 */
	@Test
	public void testRoadTripGetHotelStarsAboveFive()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setHotelStars(7);
		assertEquals(5, a.getHotelStars());		
	}
	
	/**
	 * Used to test the getHotelStars method when the rating is below 1 star.
	 */
	@Test
	public void testRoadTripGetHotelStarsBelowOne()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setHotelStars(-57);
		assertEquals(1, a.getHotelStars());		
	}
	
	/**
	 * Used to test the getPrice.
	 */
	@Test
	public void testRoadTripGetPrice()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.getPrice();
		assertEquals(1107.8200000000002, a.getPrice(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getDepositAmount.
	 */
	@Test
	public void testRoadTripGetDepositAmount()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.getDepositAmount();
		assertEquals(1035.7300000000002, a.getDepositAmount(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getAmountDue.
	 */
	@Test
	public void testRoadTripGetAmountDue()
	{
		String[] stops2 = new String[3];
		stops2[0] = "North Platte";
		stops2[1] = "Denver";
		stops2[2] = "Aspen";
		RoadTrip a = new RoadTrip("Skiing in Aspen", 12, stops2, 2.50, 1450, 2, 5);
		a.getAmountDue();
		assertEquals(0, a.getAmountDue(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getCarCost with one a one day rental.
	 */
	@Test
	public void testRoadTripGetCarCostOne()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 1, 2);
		assertEquals(36.75, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a two day rental.
	 */
	@Test
	public void testRoadTripGetCarCostTwo()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 1, 2);
		assertEquals(36.75, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	
	/**
	 * Used to test the getCarCost with one a three day rental.
	 */
	@Test
	public void testRoadTripGetCarCostThree()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 3, 2);
		assertEquals(50.13, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a four day rental.
	 */
	@Test
	public void testRoadTripGetCarCostFour()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		assertEquals(50.13, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a five day rental.
	 */
	@Test
	public void testRoadTripGetCarCostFive()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 5, 2);
		assertEquals(60.25, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a six day rental.
	 */
	@Test
	public void testRoadTripGetCarCostSix()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 6, 2);
		assertEquals(60.25, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a seven day rental.
	 */
	@Test
	public void testRoadTripGetCarCostSeven()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 7, 2);
		assertEquals(70.50, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a eight day rental.
	 */
	@Test
	public void testRoadTripGetCarCostEight()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 8, 2);
		assertEquals(70.50, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a nine day rental.
	 */
	@Test
	public void testRoadTripGetCarCostNine()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 9, 2);
		assertEquals(150.00, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a ten day rental.
	 */
	@Test
	public void testRoadTripGetCarCostNinePlus()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 10, 2);
		assertEquals(150.00, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getCarCost with one a zero day rental.
	 */
	@Test
	public void testRoadTripGetCarCostZero()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 0, 0);
		assertEquals(36.75, a.getCarCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with one person in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostOne()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 1, 2);
		assertEquals(51.26, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with one person in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostTwo()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 1, 2);
		assertEquals(51.26, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);		
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with three people in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostThree()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 3, 2);
		assertEquals(72.09, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with five people in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostFive()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 5, 2);
		assertEquals(82.39, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with six people in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostSix()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 5, 2);
		assertEquals(82.39, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with seven people in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostSeven()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 7, 2);
		assertEquals(104.86, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with eight people in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostEight()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 8, 2);
		assertEquals(104.86, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with nine people in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostNine()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 9, 2);
		assertEquals(153.79, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getEstimatedFuelCost with more than nine people in the car.
	 */
	@Test
	public void testRoadTripEstimatedFuelCostNinePlus()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 10, 2);
		assertEquals(153.79, a.getEstimatedFuelCost(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getNumStops method.
	 */
	@Test
	public void testRoadTripGetNumStops()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		assertEquals(4, a.getNumStops());
	}
	
	/**
	 * Used to test the setPersons method when valid.
	 */
	@Test
	public void testRoadTripSetPersonsValid()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setPersons(6);
		assertEquals(6, a.getNumPersons());
	}
	
	/**
	 * Used to test the setPersons method when invalid.
	 */
	@Test
	public void testRoadTripSetPersonsInvalid()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setPersons(-12);
		assertEquals(1, a.getNumPersons());
	}
	
	/**
	 * Used to test the setFuelPrice method when valid.
	 */
	@Test
	public void testRoadTripSetFuelPriceValid()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setFuelPrice(5.00);
		assertEquals(5.00, a.getFuelPrice(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the setFuelPrice method when invalid.
	 */
	@Test
	public void testRoadTripSetFuelPriceInvalid()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, -7.00, 1183, 4, 2);
		a.setFuelPrice(-7.00);
		assertEquals(2.50, a.getFuelPrice(), DOUBLE_TOLERANCE);
	}
	
	/**
	 * Used to test the getStops method.
	 */
	@Test
	public void testRoadTripGetStops()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		assertEquals(4, a.getNumStops());
	}
	
	/**
	 * Used to test the getStops method.
	 */
	@Test
	public void testRoadTripGetStopsNull()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = null;
		RoadTrip a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		assertEquals(4, a.getNumStops());
	}
	
	//TESTING VACATION PACAKGE METHODS
	
	/**
	 * Used to test the setName method from vacation package class.
	 */
	@Test
	public void testVacationPackageSetNameValid()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		VacationPackage a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setName("Todd");
		assertEquals("Todd", a.getName());
	}
	
	/**
	 * Used to test the setName method from vacation package class when empty.
	 */
	@Test
	public void testVacationPackageSetNameInvalidEmpty()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		VacationPackage a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setName("");
		assertEquals("PACKAGE NAME TBD", a.getName());
	}
	
	/**
	 * Used to test the setName method from vacation package class when null.
	 */
	@Test
	public void testVacationPackageSetNameInvalidNull()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		VacationPackage a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setName(null);
		assertEquals("PACKAGE NAME TBD", a.getName());
	}
	
	/** 
	 * Used to test the setLength method from vacation package class.
	 */
	@Test
	public void testVacationPackageSetLengthValid()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		VacationPackage a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setLength(5);
		assertEquals(5, a.getNumDays());
	}
	
	/**
	 * Used to test the setLength method from vacation package class when invalid.
	 */
	@Test
	public void testVacationPackageSetLengthInvalid()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		VacationPackage a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.setLength(-420);
		assertEquals(1, a.getNumDays());
	}
	
	/**
	 * Used to test the equals method from vacation package class when true.
	 */
	@Test
	public void testVacationPackageEqualsTrue()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		VacationPackage a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		VacationPackage b = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		a.equals(b);
		assertTrue(a.equals(b));
	}
	
	/**
	 * Used to test the equals method from vacation package class when false.
	 */
	@Test
	public void testVacationPackageEqualsFalse()
	{
		String[] test = new String[4];
		test[0] = "Chimney Rock";
		test[1] = "Carnege";
		test[2] = "Mt. Rushmore";
		test[3] = "The Corn Palace";
		VacationPackage a = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				test, 1.95, 1183, 4, 2);
		VacationPackage b = new RoadTrip("Not Mt. Rushmore and the Badlands", 3,
				test, 1.99, 1000, 5, 3);
		a.equals(b);
		assertFalse(a.equals(b));
	}
}
