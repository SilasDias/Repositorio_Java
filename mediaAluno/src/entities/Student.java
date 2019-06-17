package entities;

public class Student {
public String name;
public double trim1;
public double trim2;
public double trim3;

public double soma() {
	return trim1 + trim2 + trim3;
}

public double media() {
	if (soma() < 60.00) {
		return 60.0 - soma();
	}
	else {
		return 0.0;
	}
}



}
