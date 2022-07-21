package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int funcionariosParaInserir = sc.nextInt();

		List<Funcionario> funcionariosCadastrados = new ArrayList<>();
		
		for (int x = 0; x != funcionariosParaInserir; x++) {
			System.out.println("Funcionário #" + (x+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			System.out.println("");
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionariosCadastrados.add(funcionario);
		}
		
		System.out.print("Digite o ID do funcionário que receberá aumento: ");
		Integer id = sc.nextInt();
		
		Integer posicao = posicao(funcionariosCadastrados, id);
		
		if (posicao != null) {
			System.out.print("Informe a porcentagem de aumento: ");
			Double aumento = sc.nextDouble();
			funcionariosCadastrados.get(posicao).aumentaSalario(aumento);
			System.out.println("");
		}
		else {
			System.out.println("O ID informado é inválido!");
			System.out.println("");
		}
		
		System.out.println("Listagem de funcionários:");
		for (Funcionario x : funcionariosCadastrados) {
			System.out.println(x);
		}

		sc.close();
	}

	
	public static Integer posicao(List<Funcionario> funcionariosCadastrados, Integer id) {
		for (int i = 0; i < funcionariosCadastrados.size(); i++) {
			if (funcionariosCadastrados.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
