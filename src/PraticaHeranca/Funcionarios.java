package PraticaHeranca;

public class Funcionarios {
	
	private double salario;
	private String nome;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Funcionarios(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	

}
