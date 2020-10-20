
public class Nodo {
	
	private int numero;
	private Nodo siguiente;

	public Nodo() {}
	public Nodo(int numero) {
		this.numero = numero;
		siguiente = null;
	}

	public int getNumero() {
		return numero;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	@Override
	public String toString() {
		return "Nodo [numero=" + numero + "]";
	}

}
