// COURSE: CSCI1620
// TERM: Fall 2019
//
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center for additional help with some of my methods.

package triptypes;

/**
 * This class encapsulates details related to an all-inclusive resort vacation package. Flight information to/from the 
 * resort location can be added an additional price. Once at the resort, all-inclusive packages are billed using a 
 * flat fee, regardless of the number of included amenities.
 * @author mattcsukker
 */
public class AllInclusiveResort extends FlightOptionalPackage
{
	/**
	 * The number of days.
	 */
	private int days;
	
	/**
	 * The number of guests per room.
	 */
	private int guestsNum;
	
	/**
	 * the price of the resort.
	 */
	private double price;
	
	/**
	 * String array for amenities.
	 */
	private java.lang.String[] amenities;
	
	/**
	 * Creates a new AllInclusiveResort package.
	 * @param name - The promotional name for this package.
	 * @param numDays - The number of days included in this vacation package.
	 * @param resort - The name of the resort.
	 * @param guestsPerRoom - The number of guests allowed per room at the included price.
	 * @param pricePerNight - The price of the stay per night.
	 * @param amenitiesList - A list of amenities available for free at the resort.
	 */
	public AllInclusiveResort(java.lang.String name, int numDays, java.lang.String resort, int guestsPerRoom,
			double pricePerNight, java.lang.String[] amenitiesList)
	{ 
		super(name, numDays);
		days = numDays;
		guestsNum = guestsPerRoom;
		price = pricePerNight;
		amenities = amenitiesList;
	}
	
	/**
	 * Retrieves a single String containing all of the available amenities at the resort. Individual amenities 
	 * should be separated by a single comma and space character, with no such separator at the end of the string.
	 * @return The amenities list.
	 */
	public java.lang.String getAmenities()
	{
		String temp = "";
		for (int i = 0; i < amenities.length; i++)
		{
			if (amenities[i] != null)
			{
				temp += amenities[i];
			}
			else
			{
				temp += amenities[i] + ", ";
			}
		}
		return temp; 
	}
	
	/**
	 * Retrieves the number of guests allowed per room at the specified rate.
	 * @return The number of guests per room.
	 */
	public int getGuestsPerRoom()
	{
		if (guestsNum <= 0)
		{
			guestsNum = 1;
		}
		return guestsNum;
	}
	
	/**
	 * The full price for this all-inclusive package, including any optional flight pricing.
	 * @return The price of a vacation package in US dollars.
	 */
	public double getPrice()
	{
		return price + this.getFlightCosts();
	}
	
	/**
	 * The required deposit amount to be made at the time of booking. All upfront flight-related costs and
	 * 50% of the total lodging costs for this trip must be paid as a deposit.
	 * @return The deposit amount required in US dollars.
	 */
	public double getDepositAmount()
	{
		double depositAmount = 0.0;
		if (this.hasFlights())
		{
			depositAmount += this.getFlightCosts();
		}
		depositAmount = price * (1 / 2);
		return depositAmount;
	}
	
	/**
	 * A formatted summary string with details about this all-inclusive resort package.
	 * @return The formatted string summary.
	 */
	public java.lang.String toString()
	{
		return String.format("");
	}
	
	/**
	 * Retrieves the subtotal for lodging associated with this all inclusive resort stay based on the number
	 * of nights in the package and the base price.
	 * @return The lodging subtotal in US dollars.
	 */
	public double getLodgingCost()
	{
		return price * days;
	}
}
