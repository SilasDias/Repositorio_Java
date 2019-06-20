package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double converter(double dollar, double quant){
		return (IOF * dollar * quant) + dollar * quant;
		
	}

}
