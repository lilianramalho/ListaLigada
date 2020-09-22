
public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.addPrimeiro(5);
		lista.addPrimeiro(10);
		lista.addFinal(18);
		lista.addFinal(30);
		lista.addPosicao(2, 50);
		lista.apresentar();
		lista.removerPrimeiro();
		lista.removerFinal();
		lista.removerPosicao(1);
		lista.apresentar();
		
	}

}
