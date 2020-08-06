// COURSE: CSCI1620
// TERM: Fall 2019
//
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center for additional help with some of my methods but I did not need any 
// help for this class.

package triptypes;

/**
 * This class represents a cruise package within the travel agency. It stores information required about the cruise 
 * ship, including departure and arrival times. It allows for optional off-ship excursion packages to be added for 
 * an additional price.
 * @author mattcsukker
 */
public class Cruise extends FlightOptionalPackage
{	
	/**
	 * The vessel you're cruising on.
	 */
	private java.lang.String vessel;
	
	/**
	 * The city you're going to.
	 */
	private java.lang.String city;
	
	/**
	 * The date of departure.
	 */
	private java.util.Calendar departDate;
	
	/**
	 * The return date.
	 */
	private java.util.Calendar returnDate;
	
	/**
	 * The price of the cruise.
	 */
	private double cruisePrice;
	
	/**
	 * Used in the set and getCabinType methods, the string used for CabinType.
	 */
	private java.lang.String cabinType;
	
	/**
	 * The price of excursions for Cruise.
	 */
	private double excursionPrice;
	
	/**
	 * Number of excursions for Cruise.
	 */
	private int excursionNum;
	
	/**
	 * The cost for the cabins.
	 */
	private double cabinCost;
	
	/**
	 * A string array for the list of excursions added.
	 */
	private java.lang.String[] excursionList = new String[10];
	
	/**
	 * Creates a new Cruise trip with specififed values for all data except optional excursions.
	 * @param name - The promotional name of the travel package.
	 * @param numDays - The number of days for this travel package.
	 * @param vesselName - The ship name for this Cruise.
	 * @param portCity - The departure port for this Cruise.
	 * @param departs - The time and date of departure from the port.
	 * @param returns - The time and date of return to the port.
	 * @param basePrice - The base price for the cheapest tier cabin (interior) on the ship. Cabin upgrades can 
	 * be accommodated through a subsequent setter call.
	 */
	public Cruise(java.lang.String name, int numDays, java.lang.String vesselName, java.lang.String portCity, 
			java.util.Calendar departs, java.util.Calendar returns, double basePrice)
	{
		super(name, numDays);
		vessel = vesselName;
		city = portCity;
		departDate = departs;
		returnDate = returns;
		cruisePrice = basePrice;
		getExcursionCosts();
		getNumExcursions();
	}
	
	/**
	 * Adds a named excursion to this Cruise. Excursions may or may not have an additional charge 
	 * associated.
	 * @param excursion - The name of the excursion to add to this package. Empty excursion values are invalid and
	 * should not result in a change to the Cruise package configuration.
	 * @param price - The price of the excursion. Prices may be >= 0, with any negative values being treated as 
	 * equivalent to 0.
	 */
	public void addExcursion(java.lang.String excursion, double price)
	{
		if (excursion != null && !excursion.equals(""))
		{	
			excursionNum++;
			if (price >= 0)
			{
				excursionPrice += price;
			}
			else
			{
				excursionPrice = 0;
			}
		}
		else 
		{
			excursionNum = 0;
		}
	}
	
	/**
	 * Retrieves an array containing all of the excursions which have been added to this Cruise, in the order in 
	 * which they were added.
	 * @return The list of excursions.
	 */
	public java.lang.String[] getExcursions()
	{
		return excursionList;
	}
	
	/**
	 * Updates the cabin configuration for this Cruise. This method can be used to upgrade a cruise from the base 
	 * price corresponding to the cheapest cabin (an interior cabin without an ocean view).
	 * @param cabin - A valid alternate cabin level for this package.
	 */
	public void setCabinType(CabinType cabin)
	{
		if (cabin == CabinType.BALCONY)
		{
			cabinType = "Balcony";
		}
		else if (cabin == CabinType.INTERIOR)
		{
			cabinType = "Interior";
		}
		else if (cabin == CabinType.SUITE)
		{
			cabinType = "Suite"; 
		}
		else
		{
			cabinType = "Ocean View";
		}
	}
	
	/**
	 * Retrieves the home port of the cruise ship for this package.
	 * @return The city from which this Cruise departs.
	 */
	public CabinType getCabinType()
	{
		CabinType result = CabinType.INTERIOR;
		if (cabinType.equals("Suite"))
		{
			result = CabinType.SUITE;
		}
		else if (cabinType.equals("Interior"))
		{
			result = CabinType.INTERIOR;
		}
		else if (cabinType.equals("Balcony"))
		{
			result = CabinType.BALCONY;
		}
		else 
		{
			result = CabinType.OCEAN_VIEW;
		}
		return result;
	}
	
	/**
	 * Retrieves the home port of the cruise ship for this package. 
	 * @return The city from which this Cruise departs.
	 */
	public java.lang.String getHomePort()
	{
		return city;
	}
	
	/**
	 * Retrieves the date and time of departure for this Cruise.
	 * @return The departure time at the port.
	 */
	public java.util.Calendar getDepartureDate()
	{
		return departDate;
	}
	
	/**
	 * Retrieves the date and time of arrival for this Cruise.
	 * @return The arrival time at the port.
	 */
	public java.util.Calendar getReturnDate()
	{
		return returnDate;
	}
	
	/**
	 * Retrieves the name of the ship sailing for this Cruise.
	 * @return The ship name.
	 */
	public java.lang.String getVesselName()
	{
		return vessel;
	}
	
	/**
	 * Retrieves the total cost for all added excursions on this Cruise.
	 * @return The excursions total in US dollars.
	 */
	public double getExcursionCosts()
	{
		return excursionPrice;
	}
	
	/**
	 * Retrieves the number of excursions which have been added to this Cruise package.
	 * @return The number of excursions.
	 */
	public int getNumExcursions()
	{
		return excursionNum;
	}
	
	/**
	 * Retrieves the full price of this Cruise package, including pre-cruise flight arrangements
	 * (as applicable), full lodging costs, and any additional excursion costs.
	 * @return The price of a vacation package in US dollars.
	 */
	public double getPrice()
	{
		return cruisePrice;
	}
	
	/**
	 * Retrieves the deposit amount required upfront for this Cruise. Cruise packages require that all applicable 
	 * flight costs and 50% of expected lodging costs are paid at the time of booking. Optional excursion costs
	 * are not included in the deposit amount, but must be paid prior to departure.
	 * @return The deposit amount required in US dollars.
	 */
	public double getDepositAmount()
	{
		double depositAmount = 0.0;
		if (this.hasFlights())
		{
			depositAmount += this.getFlightCosts();
		}
		depositAmount += getLodgingCost() / 2.0;
		return depositAmount; 
	} 
	
	/**
	 * Retrieves the lodging charge for this Cruise package, calculated from the base price scaled on the cabin 
	 * level.
	 * @return The lodging subtotal in US dollars.
	 */
	public double getLodgingCost()
	{
		return cabinCost;
	}
	
	/**
	 * Retrieves a formatted string summarizing this Cruise package.
	 * @return The formatted string summary.
	 */
	public java.lang.String toString()
	{
		return String.format(super.toString());
	}
}
