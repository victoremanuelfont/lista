package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Contabilidade;
import entitie.Empregado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de Empregados: ");
		int n = sc.nextInt();
		System.out.println();

		Empregado funcionario = new Empregado();
		List<Empregado> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.printf("\nFuncionário #%d ", i + 1);
			System.out.print("\nid: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();

			funcionario = new Empregado(id, nome, salario);
			list.add(funcionario);
		}

		System.out.println("Id do funcionário: ");
		int id = sc.nextInt();
		System.out.println("Porcentagem: ");
		double porcentagem = sc.nextDouble();

		Contabilidade cont = new Contabilidade();

		for (Empregado identificacao : list) {
			if (identificacao.getId().equals(id)) {
				id = identificacao.getId();
				double salario = identificacao.getSalario();
				double salarioAtualizado = cont.incremento(salario, porcentagem);
				identificacao.setSalario(salarioAtualizado);
				for(Empregado todos: list) {
					System.out.println(todos);
				}
			}
		}

		sc.close();
	}

}
