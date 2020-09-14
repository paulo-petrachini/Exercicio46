
public class FolhaDePagamento {
	public static void main (String args[]) {
		
		Empregado lista[];
		double liquido;
		
		lista = new Empregado[5];
		
		lista[0] = new Empregado("Paulo", "Programador", 1900.0);
		lista[1] = new Empregado("Maria", "Programadora", 2700.0);
		lista[2] = new Empregado("João", "Analista", 6000.0);
		lista[3] = new Empregado("Isidro", "Analista", 3300.0);
		lista[4] = new Empregado("Ana", "Analista", 3800.0);
		
		for (int posicao = 0; posicao <= 4; posicao++) {
			liquido = lista[posicao].getSalario() - lista[posicao].calcularImposto();
			System.out.println("Nome: "+lista[posicao].getNome()+" Cargo: "+lista[posicao].getCargo()+" Salário Bruto: "+lista[posicao].getSalario()+" Salário Líquido: "+liquido);
		}
	}
}
