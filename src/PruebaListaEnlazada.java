
public class PruebaListaEnlazada {

	public static void main(String[] args) {
		
		ListaEnlazada le = new ListaEnlazada();
		
		System.out.println(le.agregarFin(1));
		System.out.println(le.agregarFin(2));
		System.out.println(le.agregarFin(3));
		System.out.println(le.agregarFin(4));
		System.out.println(le.agregarFin(5));
		System.out.println(le.agregarFin(6));
		System.out.println(le.agregarInicio(7));
		System.out.println(le.agregarInicio(8));
		System.out.println(le.agregarInicio(9));
		
		System.out.println(le.eliminarEnPosicion(3));
		System.out.println(le.eliminarFin());
		System.out.println(le.eliminarInicio());
		System.out.println(le.agregarFin(6));
		System.out.println(le.agregarInicio(9));
		System.out.println(le.agregarEnPosicion(1, 3));
		
		le.buscarElemento(-1);
		le.buscarElemento(9);
		le.buscarElemento(11);
		
		le.mostrarCantidadDeElementos();
		
		le.mostrarPrimero();
		le.mostrarUltimo();
		
		System.out.println("------------");
		le.verLista();

	}

}
