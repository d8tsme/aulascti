package exercicios;

public class Carro extends Veiculo {
	// exercicio 5
	void mover() {
		System.out.println("Movimento de Carro.");
	}
	
	// exercicio 11
	private int velocidade;
	
	public void acelerar(int valor) {
		if(valor>100) {
			System.out.println("Calma! Acelere menos que 100km.");
		} else if (valor<=0) {
			System.out.println("Não é possível acelerar valores negativos ou nulos.");
		} else {
			this.velocidade += valor;
		}
	}
	
	public void frear(int valor) {
		if(valor>100) {
			System.out.println("Calma! Freie menos que 100km.");
		} else if (valor<=0) {
			System.out.println("Não é possível frear valores negativos ou nulos.");
		} else {
			this.velocidade -= valor;
		}
	}
}
