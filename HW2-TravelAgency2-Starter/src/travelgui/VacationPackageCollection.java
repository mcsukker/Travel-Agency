// COURSE: CSCI1620
// TERM: Fall 2019
//
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center for additional help with some of my methods but I did not 
// utilize any help for this class.

package travelgui;

import triptypes.AllInclusiveResort;
import triptypes.Cruise;
import triptypes.FlightOptionalPackage;
import triptypes.RoadTrip;
import triptypes.VacationPackage;

/**
 * This class serves as a collection to store, filter, and explore VacationPackages  within the trip search user
 * interface. Up to 25 VacationPackages can be stored in a single collection.
 * @author mattcsukker
 */
public class VacationPackageCollection
{
	/**
	 * the 25 vacation packages that can be stored.
	 */
	private static final int TRIPS_MAX = 25;
	
	/**
	 * Number of trips went on.
	 */
	private int numTrips;
	
	/**
	 * Vacation package object that stores the number of vacations.
	 */
	private VacationPackage[] vacays = new VacationPackage[TRIPS_MAX];
	
	/**
	 * Creates a new empty VacationPackageCollection.
	 */
	public VacationPackageCollection()
	{
		numTrips = 0;
	}
	
	/**
	 * Retrieves the number of trip packages that have been added to this collection for purchase.
	 * @return The total number of available packages.
	 */
	public int getNumTrips()
	{
		return numTrips;
	}
	
	/**
	 * Retrieves an array of all available packages from the collection. Valid packages are guaranteed to be stored 
	 * contiguously in the left most array cells. Any empty cells will appear to the right of the last valid 
	 * VacationPackage. Unless a sort has occurred, packages will appear in the order in which they were added.
	 * @return The list of available packages.
	 */ 
	public VacationPackage[] getAllVacations()
	{
		return vacays;
	}
	
	/**
	 * Adds a single trip package to the collection at the next available position. If adding this trip would result
	 * in more than 25 total packages, it will not be added to the collection.
	 * @param trip - The trip to add to the collection.
	 */
	public void addVacation(VacationPackage trip)
	{
		if (trip != null && numTrips < TRIPS_MAX)
		{
			vacays[numTrips] = trip;
			numTrips++;
		}
	}
	 
	/**
	 * Retrieves a filtered subcollection of trips corresponding to a specific suptype. Should no trips of a 
	 * specified type be present in this VacationPackageCollection an empty collection containing zero packages will
	 * be returned.
	 * @param selection - An integer signaling what type of packages to extract. 1 represents RoadTrips, 
	 * 2 represents Cruises, and 3 represents All-Inclusive Resort packages.
	 * @return The filtered subcollection of packages, or an empty collection if no matching packages exist in this
	 * collection.
	 */
	public VacationPackageCollection filterVacationsFor(int selection)
	{
		VacationPackageCollection packageType = new VacationPackageCollection();
		if (selection == 1) //roadtrips
		{
			VacationPackageCollection roadTripType = new VacationPackageCollection();
			for (int i = 0; i < numTrips; i++)
			{
				if (vacays[i] instanceof RoadTrip)
				{
					packageType = roadTripType;
				}
			}
		}
		else if (selection == 2) //cruises
		{
			VacationPackageCollection cruiseType = new VacationPackageCollection();
			for (int i = 0; i < numTrips; i++)
			{
				if (vacays[i] instanceof Cruise)
				{ 
					packageType = cruiseType;
				}
			}
		}
		else if (selection == 3) //all-inclusive
		{
			VacationPackageCollection allInclusiveType = new VacationPackageCollection();
			for (int i = 0; i < numTrips; i++)
			{
				if (vacays[i] instanceof AllInclusiveResort)
				{
					packageType = allInclusiveType;
				}
			}
		}
		return packageType;
	}
	
	/**
	 * Produces a summary of flight information inside a VacationPackage for detail display elsewhere. In addition 
	 * to properly extracting flight details when the given index corresponds to a FlightOptionalPackage with one or
	 * more flight legs, this method will also detect various error conditions. 
	 * @param index - The index position in the collection from which to extract flight information.
	 * @return The formatted flight details, with one Flight per line and each Flight displayed as detailed in 
	 * Flight.toString.
	 */
	public java.lang.String getFlightDetails(int index)
	{
		String output = "";
		if (!((FlightOptionalPackage) vacays[index]).hasFlights())
		{
			output = "ERROR: The selected trip has no flight information.";
		}
		else if (vacays[index] instanceof RoadTrip)
		{
			output = "ERROR: No flights are allowed for this type of trip!";
		}
		else if (index < 0 || index > TRIPS_MAX)
		{
			output = "ERROR: Index is out of range!";
		}
		return output;
	}
	
	/**
	 * Provides o-based indexed access to the VacationPackageCollection.
	 * @param index - The index position whose VacationPackage should be returned.
	 * @return The selected VacationPackage when index is valid. The method will return null otherwise.
	 */
	public VacationPackage getItemAt(int index)
	{
		return vacays[index];
	}
	
	/**
	 * Produces a stable sort of the contents of this VacationPackageCollection, with the sort order determined by 
	 * an externally specified criteria. When byPrice is true, this method will sort all available packages in 
	 * ascending order by total package price. When false, the method sorts packages in standard lexicographically
	 * ascending order by package name.
	 * @param byPrice - A flag which sets the sort criteria as described above.
	 */
	public void sortCollection(boolean byPrice)
	{
		//did not finish
	}
}
