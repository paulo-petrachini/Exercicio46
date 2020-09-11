
public class EmpregadoTeste {
	public static void main(String args[]) {
		Empregado e1;
		e1 = new Empregado();
		
		e1.nome = "Paulo R. Petrachini";
		e1.cargo = "Analista de Sistemas";
		e1.salario = 1000.0;
		e1.imprimir();
	}
}
