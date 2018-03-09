package converter;

/**
 * Enum for convert form one unit to another unit.
 * @author Thanaphon Keawjam
 */
public enum Length {

	Mile(1609.344),
	Kilometer(1000.0),
	Meter(1.0),
	Centimeter(0.01),
	Foot(0.30480),
	Wa(2.0),
	AU(149597870700.00);
	
	
	private final double value;
	
	/**
	 * Constructor for Length.
	 * @param value is value for convert.
	 */
	private Length(double value) {
		this.value = value;
	}
	
	/**
	 * Get value for convert.
	 * @return value for convert.
	 */
	public double getValue() {
		return this.value;
	}
	
}
