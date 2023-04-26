package entidade;

public class Funcionario {

	public String name;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;

	public double calculaSalario() {
		return salarioBruto - imposto;
	}

	public double totalPorcentagem() {
		porcentagem = (salarioBruto * porcentagem) / 100;
		return (salarioBruto - imposto) + porcentagem;
	}

}
