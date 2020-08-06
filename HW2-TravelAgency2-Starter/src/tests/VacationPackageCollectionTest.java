// COURSE: CSCI1620
// TERM: Fall 2019
//
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center for additional help with some of my methods.

package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import travelgui.VacationPackageCollection;
import triptypes.AllInclusiveResort;
import triptypes.Cruise;
import triptypes.RoadTrip;
import triptypes.VacationPackage;

/**
 * Tests the VacationPackageCollection class.
 * @author mattcsukker
 */
public class VacationPackageCollectionTest 
{
	/**
	 * Compares two doubles.
	 */
	public static final double DOUBLE_TOLERANCE = 0.001;
	
	/**
	 * Tests the constructor.
	 */
	@Test
	public void testVacationPackageCollectionConstructor()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		assertEquals(0, a.getNumTrips());
	}
	
	/**
	 * Tests the getAllVacations method.
	 */
	@Test
	public void testVacationPackageCollectionGetAllVacations()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		assertEquals(0, a.getNumTrips());
		String[] amenitiesList = new String[3];
		amenitiesList[0] = "Meals at Timber";
		amenitiesList[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		amenitiesList[2] = "Mud Therapy Session";
		AllInclusiveResort b = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, amenitiesList);
		String[] stopsList = new String[4];
		stopsList[0] = "Chimney Rock";
		stopsList[1] = "Carnege";
		stopsList[2] = "Mt. Rushmore";
		stopsList[3] = "The Corn Palace";
		RoadTrip c = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stopsList, 1.95, 1183, 4, 2);
		SimpleDateFormat cruise = new SimpleDateFormat("HH:mm MM-dd-YYYY");
		Calendar aa = Calendar.getInstance();
		aa.set(2019, 2, 12, 10, 00);
		Calendar bb = Calendar.getInstance();
		bb.set(2019, 2, 19, 17, 30);
		Cruise d = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				aa, bb, 1999.00);
		Calendar aaa = Calendar.getInstance();
		aa.set(2019, 2, 9, 11, 00);
		Calendar bbb = Calendar.getInstance();
		bb.set(2019, 2, 9, 12, 30);
		Cruise e = new Cruise("Sailing the Mighty Missouri", 1, "River City Star", "Omaha, NE", aa, bb, 20.00);
		String[] stopsList2 = new String[3];
		stopsList2[0] = "North Platte";
		stopsList2[1] = "Denver";
		stopsList2[2] = "Aspen";
		RoadTrip f = new RoadTrip("Skiing in Aspen", 12, stopsList2, 2.50, 1450, 2, 5);
		String[] amenitiesList2 = new String[6];
		amenitiesList2[0] = "Aromatherapy";
		amenitiesList2[1] = "Sauna";
		amenitiesList2[2] = "Massage";
		amenitiesList2[3] = "Laundry";
		amenitiesList2[4] = "Gourmet Restaurant";
		amenitiesList2[5] = "Private Butler";
		AllInclusiveResort k = new AllInclusiveResort("Relax Your Cares Away in the DR", 4, "Zoetry Punta Cana", 
				2, 425.00, amenitiesList2);
		a.addVacation(b);
		a.addVacation(c);
		a.addVacation(d); 
		a.addVacation(e);
		VacationPackage[] arrTest = new VacationPackage[25];
		arrTest[0] = b;
		arrTest[1] = c;
		arrTest[2] = d;
		arrTest[3] = e;
		assertArrayEquals(arrTest, a.getAllVacations());
	}
	
	/**
	 * Tests FilterVacation method for RoadTrip.
	 */
	@Test
	public void testVacationPackageCollectionFilterVacationRoadTrip()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		assertEquals(0, a.getNumTrips());
		String[] amenitiesList = new String[3];
		amenitiesList[0] = "Meals at Timber";
		amenitiesList[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		amenitiesList[2] = "Mud Therapy Session";
		AllInclusiveResort b = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, amenitiesList);
		String[] stopsList = new String[4];
		stopsList[0] = "Chimney Rock";
		stopsList[1] = "Carnege";
		stopsList[2] = "Mt. Rushmore";
		stopsList[3] = "The Corn Palace";
		RoadTrip c = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stopsList, 1.95, 1183, 4, 2);
		SimpleDateFormat cruise = new SimpleDateFormat("HH:mm MM-dd-YYYY");
		Calendar aa = Calendar.getInstance();
		aa.set(2019, 2, 12, 10, 00);
		Calendar bb = Calendar.getInstance();
		bb.set(2019, 2, 19, 17, 30);
		Cruise d = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				aa, bb, 1999.00);
		Calendar aaa = Calendar.getInstance();
		aa.set(2019, 2, 9, 11, 00);
		Calendar bbb = Calendar.getInstance();
		bb.set(2019, 2, 9, 12, 30);
		Cruise e = new Cruise("Sailing the Mighty Missouri", 1, "River City Star", "Omaha, NE", aa, bb, 20.00);
		String[] stopsList2 = new String[3];
		stopsList2[0] = "North Platte";
		stopsList2[1] = "Denver";
		stopsList2[2] = "Aspen";
		RoadTrip f = new RoadTrip("Skiing in Aspen", 12, stopsList2, 2.50, 1450, 2, 5);
		String[] amenitiesList2 = new String[6];
		amenitiesList2[0] = "Aromatherapy";
		amenitiesList2[1] = "Sauna";
		amenitiesList2[2] = "Massage";
		amenitiesList2[3] = "Laundry";
		amenitiesList2[4] = "Gourmet Restaurant";
		amenitiesList2[5] = "Private Butler";
		AllInclusiveResort k = new AllInclusiveResort("Relax Your Cares Away in the DR", 4, "Zoetry Punta Cana", 
				2, 425.00, amenitiesList2);
		a.addVacation(b);
		a.addVacation(c);
		a.addVacation(d); 
		a.addVacation(e);
		VacationPackageCollection filter = a.filterVacationsFor(1);
		assertEquals(a.getItemAt(5).getName(), filter.getItemAt(1).getName());	
	}
	
	/**
	 * Tests FilterVacation method for cruise.
	 */
	@Test
	public void testVacationPackageCollectionFilterVacationCruise()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		assertEquals(0, a.getNumTrips());
		String[] amenitiesList = new String[3];
		amenitiesList[0] = "Meals at Timber";
		amenitiesList[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		amenitiesList[2] = "Mud Therapy Session";
		AllInclusiveResort b = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, amenitiesList);
		String[] stopsList = new String[4];
		stopsList[0] = "Chimney Rock";
		stopsList[1] = "Carnege";
		stopsList[2] = "Mt. Rushmore";
		stopsList[3] = "The Corn Palace";
		RoadTrip c = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stopsList, 1.95, 1183, 4, 2);
		SimpleDateFormat cruise = new SimpleDateFormat("HH:mm MM-dd-YYYY");
		Calendar aa = Calendar.getInstance();
		aa.set(2019, 2, 12, 10, 00);
		Calendar bb = Calendar.getInstance();
		bb.set(2019, 2, 19, 17, 30);
		Cruise d = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				aa, bb, 1999.00);
		Calendar aaa = Calendar.getInstance();
		aa.set(2019, 2, 9, 11, 00);
		Calendar bbb = Calendar.getInstance();
		bb.set(2019, 2, 9, 12, 30);
		Cruise e = new Cruise("Sailing the Mighty Missouri", 1, "River City Star", "Omaha, NE", aa, bb, 20.00);
		String[] stopsList2 = new String[3];
		stopsList2[0] = "North Platte";
		stopsList2[1] = "Denver";
		stopsList2[2] = "Aspen";
		RoadTrip f = new RoadTrip("Skiing in Aspen", 12, stopsList2, 2.50, 1450, 2, 5);
		String[] amenitiesList2 = new String[6];
		amenitiesList2[0] = "Aromatherapy";
		amenitiesList2[1] = "Sauna";
		amenitiesList2[2] = "Massage";
		amenitiesList2[3] = "Laundry";
		amenitiesList2[4] = "Gourmet Restaurant";
		amenitiesList2[5] = "Private Butler";
		AllInclusiveResort k = new AllInclusiveResort("Relax Your Cares Away in the DR", 4, "Zoetry Punta Cana", 
				2, 425.00, amenitiesList2);
		a.addVacation(b);
		a.addVacation(c);
		a.addVacation(d); 
		a.addVacation(e);
		VacationPackageCollection filter = a.filterVacationsFor(2);
		assertEquals(a.getItemAt(3).getName(), filter.getItemAt(1).getName());	
	}
	
	/**
	 * Tests FilterVacation method for AllInclusive.
	 */
	@Test
	public void testVacationPackageCollectionFilterAllInclusive()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		assertEquals(0, a.getNumTrips());
		String[] amenitiesList = new String[3];
		amenitiesList[0] = "Meals at Timber";
		amenitiesList[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		amenitiesList[2] = "Mud Therapy Session";
		AllInclusiveResort b = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, amenitiesList);
		String[] stopsList = new String[4];
		stopsList[0] = "Chimney Rock";
		stopsList[1] = "Carnege";
		stopsList[2] = "Mt. Rushmore";
		stopsList[3] = "The Corn Palace";
		RoadTrip c = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stopsList, 1.95, 1183, 4, 2);
		SimpleDateFormat cruise = new SimpleDateFormat("HH:mm MM-dd-YYYY");
		Calendar aa = Calendar.getInstance();
		aa.set(2019, 2, 12, 10, 00);
		Calendar bb = Calendar.getInstance();
		bb.set(2019, 2, 19, 17, 30);
		Cruise d = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				aa, bb, 1999.00);
		Calendar aaa = Calendar.getInstance();
		aa.set(2019, 2, 9, 11, 00);
		Calendar bbb = Calendar.getInstance();
		bb.set(2019, 2, 9, 12, 30);
		Cruise e = new Cruise("Sailing the Mighty Missouri", 1, "River City Star", "Omaha, NE", aa, bb, 20.00);
		String[] stopsList2 = new String[3];
		stopsList2[0] = "North Platte";
		stopsList2[1] = "Denver";
		stopsList2[2] = "Aspen";
		RoadTrip f = new RoadTrip("Skiing in Aspen", 12, stopsList2, 2.50, 1450, 2, 5);
		String[] amenitiesList2 = new String[6];
		amenitiesList2[0] = "Aromatherapy";
		amenitiesList2[1] = "Sauna";
		amenitiesList2[2] = "Massage";
		amenitiesList2[3] = "Laundry";
		amenitiesList2[4] = "Gourmet Restaurant";
		amenitiesList2[5] = "Private Butler";
		AllInclusiveResort k = new AllInclusiveResort("Relax Your Cares Away in the DR", 4, "Zoetry Punta Cana", 
				2, 425.00, amenitiesList2);
		a.addVacation(b);
		a.addVacation(c);
		a.addVacation(d); 
		a.addVacation(e);
		VacationPackageCollection filter = a.filterVacationsFor(3);
		assertEquals(a.getItemAt(6).getName(), filter.getItemAt(1).getName());	
	}
	
	/**
	 * Tests FilterVacation method for getFlightDetails when flights aren't allowed.
	 */
	@Test
	public void testVacationPackageCollectionGetFlightDetailsNotAllowed()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		String[] stops = new String[4];
		stops[0] = "Chimney Rock";
		stops[1] = "Carnege";
		stops[2] = "Mt. Rushmore";
		stops[3] = "The Corn Palace";
		RoadTrip b = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stops, 1.95, 1183, 4, 2);
		a.addVacation(b);
		assertEquals("ERROR: No flights are allowed for this type of trip!", a.getFlightDetails(0));
	}
	
	/**
	 * Tests FilterVacation method for getFlightDetails when there are no flights.
	 */
	@Test
	public void testVacationPackageCollectionGetFlightDetailsNoFlights()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		String[] stops = new String[4];
		stops[0] = "Chimney Rock";
		stops[1] = "Carnege";
		stops[2] = "Mt. Rushmore";
		stops[3] = "The Corn Palace";
		RoadTrip b = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stops, 1.95, 1183, 4, 2);
		a.addVacation(b);
		assertEquals("ERROR: The selected trip has no flight information.", a.getFlightDetails(0));
	}
	
	/**
	 * Tests FilterVacation method for getFlightDetails when they're out of range.
	 */
	@Test
	public void testVacationPackageCollectionGetFlightDetailsOutOfRange()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		String[] stops = new String[4];
		stops[0] = "Chimney Rock";
		stops[1] = "Carnege";
		stops[2] = "Mt. Rushmore";
		stops[3] = "The Corn Palace";
		RoadTrip b = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stops, 1.95, 1183, 4, 2);
		a.addVacation(b);
		assertEquals("ERROR: Index is out of range!", a.getFlightDetails(0));
	}
	
	/**
	 * Tests the sortCollection alphabetically.
	 */
	@Test
	public void testVacationPackageCollectionSortCollectionAlphabetical()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		assertEquals(0, a.getNumTrips());
		String[] amenitiesList = new String[3];
		amenitiesList[0] = "Meals at Timber";
		amenitiesList[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		amenitiesList[2] = "Mud Therapy Session";
		AllInclusiveResort b = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, amenitiesList);
		String[] stopsList = new String[4];
		stopsList[0] = "Chimney Rock";
		stopsList[1] = "Carnege";
		stopsList[2] = "Mt. Rushmore";
		stopsList[3] = "The Corn Palace";
		RoadTrip c = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stopsList, 1.95, 1183, 4, 2);
		SimpleDateFormat cruise = new SimpleDateFormat("HH:mm MM-dd-YYYY");
		Calendar aa = Calendar.getInstance();
		aa.set(2019, 2, 12, 10, 00);
		Calendar bb = Calendar.getInstance();
		bb.set(2019, 2, 19, 17, 30);
		Cruise d = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				aa, bb, 1999.00);
		Calendar aaa = Calendar.getInstance();
		aa.set(2019, 2, 9, 11, 00);
		Calendar bbb = Calendar.getInstance();
		bb.set(2019, 2, 9, 12, 30);
		Cruise e = new Cruise("Sailing the Mighty Missouri", 1, "River City Star", "Omaha, NE", aa, bb, 20.00);
		String[] stopsList2 = new String[3];
		stopsList2[0] = "North Platte";
		stopsList2[1] = "Denver";
		stopsList2[2] = "Aspen";
		RoadTrip f = new RoadTrip("Skiing in Aspen", 12, stopsList2, 2.50, 1450, 2, 5);
		String[] amenitiesList2 = new String[6];
		amenitiesList2[0] = "Aromatherapy";
		amenitiesList2[1] = "Sauna";
		amenitiesList2[2] = "Massage";
		amenitiesList2[3] = "Laundry";
		amenitiesList2[4] = "Gourmet Restaurant";
		amenitiesList2[5] = "Private Butler";
		AllInclusiveResort k = new AllInclusiveResort("Relax Your Cares Away in the DR", 4, "Zoetry Punta Cana", 
				2, 425.00, amenitiesList2);
		a.addVacation(b);
		a.addVacation(c);
		a.addVacation(d); 
		a.addVacation(e);
		//ADD ON
	}
	
	/**
	 * Tests the sortCollection in ascending order.
	 */
	@Test
	public void testVacationPackageCollectionSortCollectionAscending()
	{
		VacationPackageCollection a = new VacationPackageCollection();
		assertEquals(0, a.getNumTrips());
		String[] amenitiesList = new String[3];
		amenitiesList[0] = "Meals at Timber";
		amenitiesList[1] = "Murder Mystery Evening at Arbor Lodge Mansion";
		amenitiesList[2] = "Mud Therapy Session";
		AllInclusiveResort b = new AllInclusiveResort("Nebraska Weekend Staycation", 2, "Lied Lodge", 
				2, 175.00, amenitiesList);
		String[] stopsList = new String[4];
		stopsList[0] = "Chimney Rock";
		stopsList[1] = "Carnege";
		stopsList[2] = "Mt. Rushmore";
		stopsList[3] = "The Corn Palace";
		RoadTrip c = new RoadTrip("Mt. Rushmore and the Badlands", 7,
				stopsList, 1.95, 1183, 4, 2);
		SimpleDateFormat cruise = new SimpleDateFormat("HH:mm MM-dd-YYYY");
		Calendar aa = Calendar.getInstance();
		aa.set(2019, 2, 12, 10, 00);
		Calendar bb = Calendar.getInstance();
		bb.set(2019, 2, 19, 17, 30);
		Cruise d = new Cruise("Rhine Getaway", 7, "Viking Buri", "Basel, Switzerland",
				aa, bb, 1999.00);
		Calendar aaa = Calendar.getInstance();
		aa.set(2019, 2, 9, 11, 00);
		Calendar bbb = Calendar.getInstance();
		bb.set(2019, 2, 9, 12, 30);
		Cruise e = new Cruise("Sailing the Mighty Missouri", 1, "River City Star", "Omaha, NE", aa, bb, 20.00);
		String[] stopsList2 = new String[3];
		stopsList2[0] = "North Platte";
		stopsList2[1] = "Denver";
		stopsList2[2] = "Aspen";
		RoadTrip f = new RoadTrip("Skiing in Aspen", 12, stopsList2, 2.50, 1450, 2, 5);
		String[] amenitiesList2 = new String[6];
		amenitiesList2[0] = "Aromatherapy";
		amenitiesList2[1] = "Sauna";
		amenitiesList2[2] = "Massage";
		amenitiesList2[3] = "Laundry";
		amenitiesList2[4] = "Gourmet Restaurant";
		amenitiesList2[5] = "Private Butler";
		AllInclusiveResort k = new AllInclusiveResort("Relax Your Cares Away in the DR", 4, "Zoetry Punta Cana", 
				2, 425.00, amenitiesList2);
		a.addVacation(b);
		a.addVacation(c);
		a.addVacation(d); 
		a.addVacation(e);
		//ADD ON
	}
	
}
