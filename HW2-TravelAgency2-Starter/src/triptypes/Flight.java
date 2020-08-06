// COURSE: CSCI1620
// TERM: Fall 2019
//
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center and Brianna helped me with 
// calendar issues with my toString method.

package triptypes;

import java.text.SimpleDateFormat;

/**
 * This class represents a single flight within the travel agency system.
 * @author mattcsukker
 */
public class Flight 
{
	/**
	 * The code of the airline.
	 */
	private java.lang.String airlineCode;
	
	/**
	 * The flight number.
	 */
	private int flightNumber;
	
	/**
	 * The airport you're departing from.
	 */
	private java.lang.String departureAirport;
	
	/**
	 * The airport you're arriving to.
	 */
	private java.lang.String arrivalAirport;
	
	/**
	 * The time you flight out.
	 */
	private java.util.Calendar departureTimeTo;
	
	/**
	 * The time you arrive.
	 */
	private java.util.Calendar arrivalTimeArrive;
	
	/**
	 * The price for the flight.
	 */
	private double flightPrice;
	
	/**
	 * Creates a new flight leg in the system.
	 * @param airline - The two letter airline code
	 * @param flightNum - The unique flight number on a given day
	 * @param from - The three letter airport code for the departure airport
	 * @param to - The three letter airport code for the arrival airport
	 * @param leavesAt - The departure time
	 * @param arrives - The arrival time
	 * @param price - The price for this flight in US dollars
	 */
	public Flight(java.lang.String airline, int flightNum, java.lang.String from, java.lang.String to,
			java.util.Calendar leavesAt, java.util.Calendar arrives, double price)
	{
		airlineCode = airline;
		flightNumber = flightNum;
		departureAirport = from;
		arrivalAirport = to;
		departureTimeTo = leavesAt;
		arrivalTimeArrive = arrives;
		flightPrice = price; 
	}
	 
	/**
	 * Retrieves the price of this flight.
	 * @return The price in US dollars.
	 */
	public double getPrice()
	{ 
		return flightPrice;
	}
	 
	/**
	 * Retrieves a formatted string summarizing this Flight.
	 * @return The formatted string
	 */
	public java.lang.String toString()
	{ 
		//Brianna helped me with Calendar issues in the toString method.
		SimpleDateFormat airplane = new SimpleDateFormat("HH:mm MM-dd-YYYY");
		return String.format("%s%4d Departs: %s at %s; Arrives %s at %s", airlineCode,
				flightNumber, departureAirport, airplane.format(departureTimeTo.getTime()), 
				arrivalAirport, airplane.format(arrivalTimeArrive.getTime()));
	} 
}
