package entitie;

public class Contabilidade extends Empregado {
	
	public Contabilidade() {
		
	}

	
	public Double incremento(Double salario, Double porcentagem) {
		return salario *(1+porcentagem);
	}
	
	
	
}
