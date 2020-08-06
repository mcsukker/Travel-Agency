// COURSE: CSCI1620
// TERM: Fall 2019
//
// NAME: Matt Csukker
// RESOURCES: I used the CS learning center and Gene helped me with setLength and setName methods.

package triptypes;

/**
 * This class serves as the base of all types of vacation packages within the travel agency program.
 * @author mattcsukker
 */
public abstract class VacationPackage 
{
	/**
	 * The name of this VacationPackage.
	 */
	private java.lang.String nameIn;
	
	/**
	 * Number of days for this VacationPackage.
	 */
	private int days;
	
	/**
	 * Initializes a VacationPackage with provided values.
	 * @param name - The promotional marketing name for this package.
	 * @param numDays - The number of days included in this VacationPackage trip.
	 */
	public VacationPackage(java.lang.String name, int numDays)
	{
		nameIn = name;
		days = numDays;
		setName(name);
		setLength(numDays); //I forgot to call these methods to the constructor, which Gene reminded me to do. 
	}
	
	/**
	 * Updates the VacationPackage's externally facing promotional name. Due to travel agency policy, this name is 
	 * never allowed to be empty as it would be confusing for agents and customers interacting with the system. 
	 * Names that do not comply with this policy will be ignored and the package will be given the name "PACKAGE 
	 * NAME TBD" as a placeholder.
	 * @param name - The updated name to use for this package.
	 */
	public void setName(java.lang.String name)
	{
		if (name != null && !name.equals(""))
		{
			nameIn = name;
		}
		else
		{
			nameIn = "PACKAGE NAME TBD";
		} 
	}
	
	/**
	 * Updates the length of this VacationPackage. All packages must have a minimum of one day.
	 * @param numDays - The new number of days for this package.
	 */
	public void setLength(int numDays)
	{
		if (numDays <= 0)
		{
			days = 1;
		}
		else 
		{
			days = numDays;
		}
	}
	
	/**
	 * Retrieves the promotional name of this package.
	 * @return The name.
	 */
	public java.lang.String getName()
	{
		return nameIn;
	}
	
	/**
	 * Retrieves the number of days included in this package.
	 * @return The number of days for this trip.
	 */
	public int getNumDays()
	{
		return days;
	} 
	
	/**
	 * This method provides the full prices of a vacation package, which must be computed based
	 * on the specific kind of trip being booked.
	 * @return The price of a vacation package in US dollars.
	 */
	public abstract double getPrice();

	/**
	 * This method provides the required upfront deposit amount for a given vacation. This must 
	 * be computed based on rules determined by specific package types, per travel agency policies.
	 * @return The deposit amount required in US dollars.
	 */
	public abstract double getDepositAmount();
	
	/**
	 * This method provides the remaining amount due to the travel agent for this trip less any 
	 * deposit made upfront.
	 * @return The remaining balance to pay the travel agency.
	 */
	public double getAmountDue()
	{
		return getPrice() - getDepositAmount();
	}
	
	/**
	 * This method provides the subtotal for a trip related to lodging expenses (ie, not including 
	 * flights, meals, and incidentals). Lodging rates are determined by specific package types.
	 * @return The lodging subtotal in US dollars.
	 */
	public abstract double getLodgingCost();
	
	/**
	 * This method produces a String summary of a VacationPackage. Strings will be prefixed with 
	 * the $ symbol, followed by trip total price rounded to two decimal places in a 8 character
	 *  wide field. Price details should be followed by two spaces and the promotional name of this trip.
	 *  @return The formatted string summary.
	 */
	public java.lang.String toString()
	{
		return String.format("$%8.2f  %s", getPrice(), nameIn);
	} 
	  
	/** 
	 * Provides a logical equality comparison for VacationPackages and any other object type.
	 * @param other - A reference to another object to be compared with this one.
	 * @return true if and only if this VacationPackage shares the same promotional name as one referred 
	 * to by other. false when other is not a valid VacationPackage object or the names do not match.
	 */
	public boolean equals(java.lang.Object other)
	{
		boolean result;
		if (other instanceof VacationPackage)
		{
			result = this.getName().equals(((VacationPackage) other).getName());
		}
		else
		{
			result = false;
		} 
		return result;
	}
}
