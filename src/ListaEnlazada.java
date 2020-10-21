
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
		
		numeroElementos++;
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
		
		numeroElementos++;
		return true;
	}
	
	
	//2c) Agregar elemento en posicion especifica
	public boolean agregarEnPosicion(int numero, int pos) {
		
		if(!(pos>=0 && pos<=numeroElementos) && pos!=0) {
			return false;
		}else{

			nuevo = new Nodo(numero);
			
		    if(!verificarNoVacia()) {
			    primeroApuntaA(nuevo);
			    ultimoApuntaA(nuevo);
		    }else {
			
			    if(pos==0) {
				    agregarEntre(nuevo, primero);
				    primeroApuntaA(nuevo);
			    }else if(pos==numeroElementos) {
				    agregarEntre(ultimo, nuevo);
				    ultimoApuntaA(nuevo);
			    }else {
			    	
				    int cont=0;
				    Nodo anterior = null;

				    for(Nodo tmp=primero; tmp!=null; tmp=tmp.getSiguiente()) {
					    if(cont==pos) {
						    anterior.setSiguiente(nuevo);
						    nuevo.setSiguiente(tmp);
						    break;
					    }
					    anterior=tmp; 
					    cont++;
				    }
			    }
		    }
		    numeroElementos++;
			return true;
		}
	}
		
			
	private void agregarEntre(Nodo primero, Nodo segundo) {
		primero.setSiguiente(segundo);
	}
	
	
	//3a) Eliminar inicio
	public Nodo eliminarInicio() {
		
		numeroElementos--;
		if(primero==null) {
			return null;
		}else {
			Nodo eliminado = primero;
			primeroApuntaA(primero.getSiguiente());
			return eliminado;
		}
	}
		
		
	//3b) Eliminar fin
	public Nodo eliminarFin() {
		
		numeroElementos--;
		if(ultimo==null) {
			return null;
		}else {
			Nodo anterior = null;
			Nodo actual;
					
			for(actual=primero; actual.getSiguiente()!=null; actual=actual.getSiguiente())
				anterior = actual;
				
				anterior.setSiguiente(null);
				ultimoApuntaA(anterior);
				return actual;
			}
	}
	
	
	//3) Eliminar elemento en posicion especifica
	public Nodo eliminarEnPosicion(int pos) {
		
		if(!(pos>=0 && pos<numeroElementos)) {
			return null;
		}else {
			
			if(!verificarNoVacia()) {
				return null;
			}else {
				Nodo tmp = primero;
				
				if(pos==0) {
					primeroApuntaA(tmp.getSiguiente());
				}else if(pos==numeroElementos-1) {
					Nodo anterior = null;

					while(tmp!=ultimo) {
						anterior = tmp;
						tmp = tmp.getSiguiente();
					}
					
					anterior.setSiguiente(null);
				}else {
					Nodo anterior = null;
					int cont=0;
					
					while(cont!=pos) {
						anterior = tmp;
						tmp = tmp.getSiguiente();
						cont++;
					}
					
					anterior.setSiguiente(tmp.getSiguiente());
				}
				
				numeroElementos--;
				return tmp;
			}
		}
	}


	//4) Mostrar elementos
	public void verLista() {
		if(verificarNoVacia()) {
			for(Nodo tmp=primero; tmp!=null; tmp=tmp.getSiguiente())
				System.out.println(tmp);
		}else {
			System.out.println("No hay elementos");
		}
	}
	
	
	//5) Mostrar elementos
	public void buscarElemento(int numero) {
		if(verificarNoVacia()) {
			Nodo tmp = primero;
			boolean encontrado = false;
			
			while(tmp!=null) {
				if(tmp.getNumero()==numero) {
					encontrado = true;
					break;
				}
				tmp = tmp.getSiguiente();
			}
			
			if(encontrado) {
				System.out.println("Encontrado!");
			}else {
				System.out.println("No se ha encontrado");
			}
		}else {
			System.out.println("No hay elementos");
		}
	}
	
	
	//6) Vacia lista
	public boolean vaciar() {
		primeroApuntaA(null);
		ultimoApuntaA(null);
		return true;
	}
		

	//7) Mostrar cantidad de elementos
	public void mostrarCantidadDeElementos() {
		if(verificarNoVacia()) {
			System.out.println(numeroElementos);
		}else {
			System.out.println("No hay elementos");
		}
	}
	
	
	//8) Mostrar primero
	public void mostrarPrimero() {
		if(verificarNoVacia()) {
			System.out.println(primero);
		}else {
			System.out.println("No hay elementos");
		}
	}


	//9) Mostrar ultimo
	public void mostrarUltimo() {
		if(verificarNoVacia()) {
			System.out.println(ultimo);
		}else {
			System.out.println("No hay elementos");
		}
	}
		
		
	//10) Verificar NO vacia(que tenga elementos)
	private boolean verificarNoVacia() {
		return primero!=null;
	}
}
