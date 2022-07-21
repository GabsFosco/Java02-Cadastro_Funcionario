package entities;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario() {
		
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

	public Double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(Double aumento) {
		salario += salario * (aumento * 0.01);
	}

}
