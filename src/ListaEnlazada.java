
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
