
public class Lista {
	
	No primeiro = null , calda = null;
	
	public void addPrimeiro(double elemento) {
		No novo = new No(elemento);
		
		if (primeiro == null) {
			primeiro = novo;
			calda = novo;
			System.out.println(novo.getItem());
		}else {
			novo.setProximo(primeiro);
			primeiro = novo;
			System.out.println(novo.getItem());
		}
	}
	
	public void removerPrimeiro() {
		if (primeiro == null) {
			System.out.println("Não há elementos para remover");
		}else {
			No auxiliar = primeiro;
			primeiro = auxiliar.getProximo();
			auxiliar.setProximo(null);
			
			System.out.println(auxiliar.getItem());
		}
		
		
	}
	
	public void addFinal(double elemento) {
		No novo = new No(elemento);
		
		if (primeiro == null) {
			primeiro = novo;
			calda = novo;
		}else {
			calda.setProximo(novo);
			calda = novo;
		}
	}
	
	public void removerFinal() {
		if (primeiro == null) {
			System.out.println("Não há elementos para remover");
		}else {
			No auxiliar = primeiro;
			while (auxiliar != null) {
				if (auxiliar.getProximo().getProximo() == null) {
					No auxiliar2 = calda;
					calda = auxiliar;
					calda.setProximo(null);
				}
				
				auxiliar = auxiliar.getProximo();
				
			}
		}
	}
	
	
	
	public void removerPosicao(int pos) {
		No auxiliar = primeiro;
		No anterior = null;
		for (int i = 0; auxiliar != null; i++) {
			if (i == pos) {
				if (anterior == null) {
					primeiro = auxiliar.getProximo();
					break;
				}
				
				anterior.setProximo(auxiliar.getProximo());
			}
			
			anterior = auxiliar;
			auxiliar = auxiliar.getProximo();
			
		}
		
		
	}
	
	public void addPosicao(int pos, double elemento) {
		No auxiliar = primeiro;
		No anterior = null;
		
		for (int i = 0;  auxiliar != null; i++) {
			if (i == pos) {
				
				
				if (i == 0) {
					No novo = new No(elemento);
					novo.setProximo(primeiro);
					primeiro = novo;
					break;
				}
				
				
				
				No novo = new No(elemento);
				novo.setProximo(auxiliar);
				anterior.setProximo(novo);
				
			}
			
			if (auxiliar.getProximo() == null) {
				if (i+1 == pos) {
					No novo = new No(elemento);
					auxiliar.setProximo(novo);
					break;
					
				}
			}
			
			anterior = auxiliar;
			auxiliar = auxiliar.getProximo();
		}
	}
	
	
	public void apresentar() {
		No aux = primeiro;
		
		System.out.println("lista");
		while (aux != null) {
			
			System.out.println(aux.getItem());
			aux = aux.getProximo();
		}
	}
	
	public boolean vazia() {
		if (primeiro == null) {
			return true;
		}else {
			return false;
		}
	}

}
