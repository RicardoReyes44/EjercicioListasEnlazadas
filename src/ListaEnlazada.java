
/*
 * OPERACIONES BASICAS DE LAS LISTAS ENLAZADAS
 * 2) Agregar elemento
 *     2c) En un lugar especifico
 *     
 * 3) Eliminar elemento
 *     3c) En un lugar especifico
 * 
 * 5) Buscar elemento
 * 7) Mostrar cantidad de elementos
 * 8) Mostrar primero
 * 9) Mostrar ultimo
 * */

public class ListaEnlazada {

	private Nodo primero;
	private Nodo ultimo;
	private Nodo nuevo;
	private int numeroElementos = 0;
	
	//1) Creacion
	public ListaEnlazada() {
		primero = ultimo = null;
	}

	
	private void primeroApuntaA(Nodo apuntar) {
		primero = apuntar;
	}
	
	
	private void ultimoApuntaA(Nodo apuntar) {
		ultimo = apuntar;
	}
	
	//2a) Agregar elemento inicio
	public boolean agregarInicio(int numero) {
		nuevo = new Nodo(numero);
			
		if(primero==null) {
			primeroApuntaA(nuevo);
			ultimoApuntaA(nuevo);
		}else {
			agregarEntre(nuevo, primero);
			primeroApuntaA(nuevo);
		}
		return true;
	}
		
		
	//2b) Agregar elementofin
	public boolean agregarFin(int numero) {
		nuevo = new Nodo(numero);
				
		if(primero==null) {
			primeroApuntaA(nuevo);
			ultimoApuntaA(nuevo);
		}else {
			agregarEntre(ultimo, nuevo);
			ultimoApuntaA(nuevo);
		}
		return true;
	}
		
			
	public void agregarEntre(Nodo primero, Nodo segundo) {
		primero.setSiguiente(segundo);
	}
	
	
	//6) Vacia lista
	public boolean vaciar() {
		primeroApuntaA(null);
		ultimoApuntaA(null);
		return true;
	}
	
	
	//8) Mostrar primero
	public void mostrarPrimero() {
		System.out.println(primero);
	}


	//9) Mostrar ultimo
	public void mostrarUltimo() {
		System.out.println(ultimo);
	}
		
		
	//10) Verificar NO vacia(que tenga elementos)
	private boolean verificarNoVacia() {
		return primero!=null;
	}
}
