package entities;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String toString() {
		return id + ", " + nome + ", R$ " + String.format("%.2f", salario);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(double aumento) {
		this.salario += salario * (aumento * 0.01);
	}

}
