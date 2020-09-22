
public class No {
	private double item;
	private No proximo;
	
	
	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	
	 
	 public No(double item) {
		this.item = item;
		proximo = null;
	}
	
	

	
	
	

}
