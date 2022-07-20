package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id;
		String nome;
		double salario;
		Funcionario funcionario;
		
		System.out.print("Quantos funcion�rios ser�o cadastrados? ");
		int funcionariosParaInserir = sc.nextInt();

		List<Funcionario> funcionariosCadastrados = new ArrayList<>();
		
		for (int x = 0; x != funcionariosParaInserir; x++) {
			System.out.println("Funcion�rio #" + (x+1) + " :");
			System.out.print("ID: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			salario = sc.nextDouble();
			System.out.println("");
			funcionariosCadastrados.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("Digite o ID do funcion�rio que receber� aumento: ");
		id = sc.nextInt();
		
		List<Funcionario> funcionarioSelecionado = funcionario.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
		
		if (funcionarioSelecionado != null) {
			System.out.print("Informe a porcentagem de aumento: ");
			double aumento = sc.nextDouble();
			funcionario.aumentaSalario(aumento);
			System.out.println("");
		}
		else {
			System.out.println("O ID informado � inv�lido!");
			System.out.println("");
		}
		
		System.out.println("Listagem de funcion�rios:");
		for (Funcionario x : funcionariosCadastrados) {
			System.out.println(x);
		}

		sc.close();
	}

}
