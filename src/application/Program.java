package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcion�rios ser�o cadastrados? ");
		int funcionariosParaInserir = sc.nextInt();

		List<Funcionario> funcionariosCadastrados = new ArrayList<>();
		
		for (int x = 0; x != funcionariosParaInserir; x++) {
			System.out.println("Funcion�rio #" + (x+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			Double salario = sc.nextDouble();
			System.out.println();
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionariosCadastrados.add(funcionario);
		}
		
		System.out.print("Digite o ID do funcion�rio que receber� aumento: ");
		Integer id = sc.nextInt();
		
		Funcionario funcionario = funcionariosCadastrados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (funcionario != null) {
			System.out.print("Informe a porcentagem de aumento: ");
			Double aumento = sc.nextDouble();
			funcionario.aumentaSalario(aumento);
			System.out.println();
		}
		else {
			System.out.println("O ID informado � inv�lido!");
			System.out.println();
		}
		
		System.out.println("Listagem de funcion�rios:");
		for (Funcionario x : funcionariosCadastrados) {
			System.out.println(x);
		}

		sc.close();
	}
	
}
