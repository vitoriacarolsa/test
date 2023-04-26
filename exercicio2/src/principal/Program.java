package principal;

import java.util.Scanner;

import entidade.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();

		System.out.println("Qual é o seu nome? ");
		func.name = sc.nextLine();

		System.out.println("Qual o seu salario bruto? ");
		func.salarioBruto = sc.nextDouble();

		System.out.println("Qual é o valor do imposto? ");
		func.imposto = sc.nextDouble();

		System.out.printf("Funcionario: " + func.name + ", salário bruto: " + func.calculaSalario());
		System.out.println();
		System.out.println("Qual o valor da porcentagem de aumento no salario?");
		func.porcentagem = sc.nextDouble();

		System.out.printf("Funcionario: " + func.name + ", salário bruto: " + func.totalPorcentagem());

	}
}
