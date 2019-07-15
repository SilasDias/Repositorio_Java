package entities;

public class BancoConta {
	
	private int conta;
	private String name;
	private double deposite;
	
	public BancoConta() {
		
	}
	
	public BancoConta(int conta, String name) {
		super();
		this.conta = conta;
		this.name = name;
	}
	
	public BancoConta(int conta, String name, double initialDeposite) {
		super();
		this.conta = conta;
		this.name = name;
		addDeposite(initialDeposite);
	}

	public int getConta() {
		return conta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposite() {
		return deposite;
	}

	public void addDeposite(double deposite) {
		this.deposite += deposite;
	}
	
	public void removedeposite(double deposite) {
		this.deposite -= deposite + 5.0;
	}

	@Override
	public String toString() {
		return "Account= " + conta + ", Name= " + name + ", Deposite= " + String.format("%.2f", deposite) + " ";
	}
	
	
	
	

}
