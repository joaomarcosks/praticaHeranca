package PraticaHeranca;

public class Main {

	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente("Davi Miguel", 7580.0, "davimig01", "davimig112358");	
		
		System.out.println("Gerente: ");
		System.out.println( "Nome: " + gerente.getNome() + "\n" + 
							"Salario: " + gerente.getSalario() + "\n" + 
							"Login: " + gerente.getLogin() + "\n" + 
							"Senha: " + gerente.getSenha() + "\n");
		
	Secretaria secretaria = new Secretaria("Maria Antonieta", 1500.0, "25556");
	
		System.out.println("Secretaria: ");
		System.out.println( "Nome: " + secretaria.getNome() + "\n" + 
							"Salario: " + secretaria.getSalario() + "\n" + 
							"Ramal: " + secretaria.getRamal() + "\n");
	
	Telefonista telefonista = new Telefonista("Angelica Miguelho", 1500.0, "4002-8922");
		
		System.out.println("Telefonista: ");
		System.out.println( "Nome: " + telefonista.getNome() + "\n" + 
							"Salario: " + telefonista.getSalario() + "\n" + 
							"Codigo: " + telefonista.getCodigo() + "\n");
			
		

	}

}
