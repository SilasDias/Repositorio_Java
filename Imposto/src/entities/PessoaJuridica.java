package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double income, Integer funcionarios) {
		super(name, income);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public double tax() {
		if (funcionarios > 10) {
			return getIncome() * 0.14;
		}
		else {
			return getIncome() * 0.16;
		}
	}
}
