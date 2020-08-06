// COURSE: CSCI1620
// TERM: Fall 2019
//
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center and Ben helped me with some of my methods in this class.

package triptypes;

/**
 * This class encapsulates information about travel packages that can include optional flight arrangements. Trips that 
 * have this format price flight information as an additional charge to a base package price captured in a concrete 
 * subclass of FlightOptionalPackage.
 * @author mattcsukker
 */
public abstract class FlightOptionalPackage extends VacationPackage
{
	/**
	 * The max number of flights that can be used.
	 */
	private static final int FLIGHT_MAX = 12;
	
	/**
	 * Counts the number of flights used.
	 */
	private int flightCounter = 0;
	
	/**
	 * The array of flights that stores the flights.
	 */
	private Flight[] arrFlight = new Flight[FLIGHT_MAX];
	
	/**
	 * Initializes details for a newly created FlightOptionalPackage. Upon creation, this package will contain no 
	 * flight bookings. However, flight legs can be added at a later point.
	 * @param name - The promotional name of this package.
	 * @param numDays - The number of days this travel package covers.
	 */
	public FlightOptionalPackage(java.lang.String name, int numDays)
	{
		super(name, numDays);
	}
	
	/**
	 * Adds a single one-way flight to this package. Round trips and layovers are handled by multiple calls to 
	 * addFlightLeg with one call for each flight. Flights must be added in chronological order, with the soonest 
	 * flight added first. A maximum of up to 12 flights can be stored within a FlightOptionalPackage.
	 * @param details - A valid flight object to append to this itinerary. Invalid values (ie, null) of flights in 
	 * excess of the 12 maximum will be ignored and will not impact this FlightOptionalPackage object.
	 */
	public void addFlightLeg(Flight details)
	{
		if (details != null && flightCounter < FLIGHT_MAX)
		{
			arrFlight[flightCounter] = details;
			flightCounter++;
		} 
		getFlightItinerary();
	}
	  
	/**
	 * A predicate method for identifying whether a concrete object has at least one flight attached to it.
	 * @return true when at least one flight has been added, false otherwise
	 */
	public boolean hasFlights()
	{ 
		//Ben helped me with this method, I was trying to make it too complicated and he helped me simplify it.
		return flightCounter > 0; 
	}  
	
	/**
	 * Retrieves the current itinerary for this travel package. Flights are positioned in the returned array in the 
	 * order in which they were added to this FlightOptionalPackage.
	 * @return The current itinerary array of Flight objects. null when no flights have been added yet.
	 */
	public Flight[] getFlightItinerary()
	{
		if (flightCounter == 0 || arrFlight[0] == null)
		{
			return null;
		} 
		return arrFlight;
	}  
	 
	/**
	 * The total cost of all legs in this FlightOptionalPackage.
	 * @return The sum of all individual flight costs in this package.
	 */
	public double getFlightCosts()
	{
		double flightCost = 0.0;
		for (int i = 0; i < arrFlight.length; i++)
		{
			if (arrFlight[i] != null)
			{
				flightCost += arrFlight[i].getPrice();	
			}
		}
		return flightCost;
	} 
	 
	/**
	 * Retrieves a formatted string summary of this travel package.
	 * @return The formatted string summary.
	 */
	public java.lang.String toString()
	{
		if (this.hasFlights())
		{
			return String.format("%s", super.toString(), " (Flight Included)");
		}
		else  
		{
			return String.format("%s", super.toString(), " (Flight Not Included)");
		}
	}  
	
}
