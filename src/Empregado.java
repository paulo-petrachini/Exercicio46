
public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	void imprimir() {
		System.out.println(" ***** Dados do Funcionário *****");
		System.out.println(" Nome:    "+nome);
		System.out.println(" Cargo:   "+cargo);
		System.out.printf(" Salário: %.2f\n",salario);
	}
	
	void aumentarSalario() {
		
	}
	double calcularImposto() {
		double imposto;
		if (salario < 2000.0){
			imposto = 0.0;
		}
		else if (salario <= 4500.0) {
			imposto = salario*0.1;
		}
		else {
			imposto = 1200.0;
		}
		return imposto;
	}
}
