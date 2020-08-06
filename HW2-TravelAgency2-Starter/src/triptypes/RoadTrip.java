// COURSE: CSCI1620
// TERM: Fall 2019
//
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center and James helped me with some of the methods in this class.

package triptypes;

/**
 * This class represents a RoadTrip vacation that includes a rental car, overnight lodging, and fuel cost 
 * estimation.
 * @author mattcsukker
 */
public class RoadTrip extends VacationPackage
{	
	/**
	 * Number of days for this RoadTrip.
	 */
	private int days;
	
	/**
	 * The list of stops for this RoadTrip.
	 */
	private java.lang.String[] numStops;
	
	/**
	 * The cost for the fuel for this RoadTrip.
	 */
	private double costOfFuel;
	
	/**
	 * The total number of miles for this RoadTrip.
	 */
	private int milesIn;
	
	/**
	 * Number of people on this RoadTrip.
	 */
	private int maxPersonsIn;
	
	/**
	 * The hotel stars for this RoadTrip.
	 */
	private int hotelStarsIn;
	
	/**
	 * Creates a newly initialized RoadTrip object using the parameter data.
	 * @param name - The promotional name to use for this RoadTrip in the travel agency system.
	 * @param numDays - The number of days required for this RoadTrip.
	 * @param stops - A list of destinations that will be visited along the way on this RoadTrip.
	 * @param fuelCost - The estimated cost of fuel in US dollars per gallon based on current rates.
	 * @param miles - The total number of miles for this RoadTrip, assuming people follow the intended route.
	 * @param maxPersons - The number of people for whom this trip package will be budgeted.
	 * @param hotelStars - The quality level of the hotels used during the RoadTrip, ranging from 1 to 5 stars 
	 * inclusive. Star values outside this range will be adjusted to the closest valid value.
	 */
	public RoadTrip(java.lang.String name, int numDays, java.lang.String[] stops,
			double fuelCost, int miles, int maxPersons, int hotelStars)
	{
		super(name, numDays);
		days = numDays;
		numStops = stops;
		setFuelPrice(fuelCost);
		milesIn = miles;
		setPersons(maxPersons);
		setHotelStars(hotelStars);
		getPrice();
		getDepositAmount();
		getLodgingCost();
		getCarCost();
		getFuelPrice();
	}
	 
	/**
	 * Retrieves the hotel quality level attached to this RoadTrip package.
	 * @return The number of stars for hotel stays.
	 */
	public int getHotelStars()
	{
		return hotelStarsIn; 
	}
	
	/**
	 * Sets number of hotel stars.
	 * @param stars - Number of stars
	 */
	public void setHotelStars(int stars)
	{
		//James from the learning center told me to create a new method to figure out how many
		//stars to give to the hotel .
		if (stars > 5)
		{
			hotelStarsIn = 5;
		}
		else if (stars < 1)
		{
			hotelStarsIn = 1;
		}
		else 
		{
			hotelStarsIn = stars;
		}
	}
	
	/**
	 * Provides the full price of this RoadTrip object. RoadTrip prices are computed based on the total rental 
	 * car, lodging, and fuel estimated costs.
	 * @return The price of a vacation package in US dollars.
	 */
	public double getPrice()
	{ 
		return getCarCost() +  getLodgingCost() + getEstimatedFuelCost();
	}
	
	/**
	 * Provides the required deposit amount for this RoadTrip object. The required deposit for a RoadTrip includes
	 * the full lodging cost plus the full rental car cost.
	 * @return The deposit amount required in US dollars.
	 */
	public double getDepositAmount()
	{
		return getLodgingCost() + getCarCost();
	}
	
	/**
	 * All RoadTrips must be fully paid in advance, with the exception of fuel costs. Fuel costs are paid to the 
	 * gas station, and not the travel agent. Thus, the balance due on RoadTrips is always 0.
	 * @return The remaining balance to pay the travel agency.
	 */
	public double getAmountDue()
	{
		return 0;
	}
	
	/**
	 * Provides the total lodging cost for a RoadTrip object. Lodging is computed based on the length of the 
	 * vacation, the quality of the hotel (in stars), the number of rooms needed for the party and a base charge
	 * of $35.20 per room per night. Lodging costs assume a maximum 2 person occupancy per room.
	 * @return The lodging subtotal in US dollars.
	 */
	public double getLodgingCost()
	{
		double lodgingCost = 0.0;
		final double BASE = 35.20;
		lodgingCost = BASE * hotelStarsIn * days * (maxPersonsIn / 2);
		return lodgingCost;
	}
	
	/**
	 * Provides the total cost for the rental car based on the trip duration and the size of car needed. Rental 
	 * cars are billed based on full days, with no partial day rentals allowed.
	 * @return The total rental car cost for this trip.
	 */
	public double getCarCost()
	{
		double carCost = 0.0;
		final double ONE = 36.75;
		final double THREE = 50.13;
		final double FIVE = 60.25;
		final double SEVEN = 70.50;
		final double NINEPLUS = 150.00;
		if (maxPersonsIn == 1 || maxPersonsIn == 2)
		{
			carCost = ONE; //36.75
		}
		else if (maxPersonsIn == 3 || maxPersonsIn == 4)
		{
			carCost = THREE; //50.13
		}
		else if (maxPersonsIn == 5 || maxPersonsIn == 6)
		{
			carCost = FIVE; //60.25
		}
		else if (maxPersonsIn == 7 || maxPersonsIn == 8)
		{
			carCost = SEVEN; //70.50
		}
		else if (maxPersonsIn >= 9)
		{
			carCost = NINEPLUS; //150.00
		}
		return carCost;
	}
	
	/**
	 * Retrieves the number of stops along the route for this RoadTrip.
	 * @return The number of intermediate destinations.
	 */
	public int getNumStops()
	{
		int result = 0;
		for (int i = 0; i < numStops.length; i++)
		{
			result++;
		}
		return result;
	}
	
	/**
	 * Updates the number of people to be used for budgeting this RoadTrip within the travel agency.
	 * @param maxPeople - The new number of people to use in calculations.
	 */
	public void setPersons(int maxPeople)
	{
		if (maxPeople > 0)
		{
			maxPersonsIn = maxPeople;
		}
		else 
		{
			maxPersonsIn = 1;
		}
	}
	
	/**
	 * Retrieves the number of people included for budget calculations by this RoadTrip.
	 * @return The number of persons.
	 */
	public int getNumPersons()
	{
		return maxPersonsIn;
	}
	
	/**
	 * Updates the cost of fuel in US dollars per gallon.  This value is used for projecting out costs 
	 * for this RoadTrip. Prices must be positive values, and a default assumption of $2.50 per gallon
	 * will be used if an invalid price is specified.
	 * @param pricePerGallon - The new price to use for cost projections.
	 */
	public void setFuelPrice(double pricePerGallon)
	{
		final double INVALID_PRICE = 2.50;
		if (pricePerGallon > 0)
		{
			costOfFuel = pricePerGallon;
		}
		else 
		{
			costOfFuel = INVALID_PRICE;
		}	
	}
	
	/**
	 * Retrieves the current fuel price used for cost projections.
	 * @return The fuel price in US dollars per gallon.
	 */
	public double getFuelPrice()
	{
		return costOfFuel;
	}
	
	/**
	 * Provides a projection of the total fuel cost for this trip based on the total number of miles to 
	 * be traveled, the fuel efficiency of the rental car, and the cost of fuel.
	 * @return The projected fuel cost in US dollars.
	 */
	public double getEstimatedFuelCost()
	{
		double mpg = 0.0;
		final double ONE = 45;
		final double THREE = 32;
		final double FIVE = 28; 
		final double SEVEN = 22;
		final double NINEPLUS = 15;
		if (maxPersonsIn == 1 || maxPersonsIn == 2)
		{
			mpg = ONE; //45
		}
		if (maxPersonsIn == 3 || maxPersonsIn == 4)
		{
			mpg = THREE; //32
		}
		if (maxPersonsIn == 5 || maxPersonsIn == 6)
		{
			mpg = FIVE; //28
		}
		if (maxPersonsIn == 7 || maxPersonsIn == 8)
		{
			mpg = SEVEN; //22
		}
		if (maxPersonsIn >= 9)
		{
			mpg = NINEPLUS; //15
		}
		double fuelCost = (milesIn / mpg) * costOfFuel;
		//this helps round the answer to two decimal places, allowing the test
		//cases to work 
		fuelCost *= 100;
		fuelCost = Math.round(fuelCost);
		fuelCost /= 100;
		return fuelCost;
	}
	
	/**
	 * Retrieves the list of stops on this RoadTrip as a single string with values separated by a comma
	 * and a single space. The last stop has no punctuation after it.
	 * @return The list of stops
	 */
	public java.lang.String getStops()
	{
		String result = "";
		int counter = 0;
		for (int i = 0; i < numStops.length; i++)
		{
			counter++;
			if (numStops[i] != null)
			{
				if (i != numStops.length) 
				{
					result = numStops[i] + ", ";
					counter++;
				}
				else if (i == numStops.length)
				{
					result += counter;
				}
			} 
		}
		return result; 
	}
	
	/**
	 * Provides a String summary of this RoadTrip.
	 * @return The formatted string summary.
	 */ 
	public java.lang.String toString()
	{
		return String.format("%s\n           A road trip with stops at %s", super.toString(), getStops());
	}	
}
