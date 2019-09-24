package entities;

public class PessoaFisica extends Contribuinte {

	private double care;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double income, double care) {
		super(name, income);
		this.care = care;
	}

	public double getCare() {
		return care;
	}

	public void setCare(double care) {
		this.care = care;
	}

	@Override
	public double tax() {
		if (getIncome() < 20000.0) {
			return (getIncome() * 0.15) - (care * 0.50);
		}
		else {
			return (getIncome() * 0.25) - (care * 0.50); 
		}
	}
}
