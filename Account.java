package entities;
//Classe Account que contém uma variável de instância name
//e métodos para configurar e obter seu valor.

public class Account {
	
	private static String name; // variavel de instancia
	
	//metodo para definir o nome no objeto
	public static void setName(String name) {
		Account.name = name; // armazena o nome
	}
	// metodo para recuperar o nome do objeto
	public static String getName() {
		return name; // retorna valor do nome para o chamador
	}

}

