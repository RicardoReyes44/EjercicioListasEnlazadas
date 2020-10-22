import java.util.InputMismatchException;
import java.util.Scanner;


public class PruebaListaEnlazada {
	
	static Scanner entrada = new Scanner(System.in);
	
	
	public static byte ingresarDato() {
		while(true) {
			System.out.print("Introduce un dato: ");
			
			byte dato = entrada.nextByte();
			
			if(dato>-1) {
				return dato;
			}else {
				System.out.println("Error no puedes ingresar esa opcion, por favor vuelve a intentarlo");
			}
		}
	}
	
	
	public static byte ingresarPosicionAgregar(byte limite) {
		
		if(limite==1) {
			return 0;
		}else {
		   return agregar(limite);
		}
	}
	
    public static byte ingresarPosicionEliminar(byte limite) {
		
		if(limite==0) {
			return 0;
		}else {
		    return agregar(limite);
		}
	}
    
    
    public static byte agregar(byte limite) {
    	while(true) {
		    System.out.print("Introduce una posicion: ");
		
		    byte pos = entrada.nextByte();
		
		    if(pos>=0 && pos<limite) {
			    return pos;
		    }else {
			    System.out.println("Error no puedes ingresar esa posicion, por favor vuelve a intentarlo\n");
		    }
	    }
    }
	
	
	public static byte ingresarSubOpcion() {

		while(true) {
			System.out.println("-----------------Sub opciones------------------");
			System.out.println("1) Inicio");
			System.out.println("2) Final");
			System.out.println("3) En una posicion");
			System.out.print("Introduce una opcion: ");
			
			byte opcion = entrada.nextByte();
			
			if(opcion>=1 && opcion<=3) {
				return opcion;
			}else {
				System.out.println("Error no puedes ingresar esa opcion, por favor vuelve a intentarlo");
			}
		}
	}
	

	public static byte ingresarOpcion() {
		
		while(true) {
			System.out.println("-----------------Menu------------------");
			System.out.println("1) Agregar elemento");
			System.out.println("2) Eliminar elemento");
			System.out.println("3) Recorrer lista");
			System.out.println("4) Buscar elemento");
			System.out.println("5) Vaciar lista");
			System.out.println("6) Ver cantida de elementos");
			System.out.println("7) Ver primero");
			System.out.println("8) Ver ultimo");
			System.out.println("9) Salir");
			System.out.print("Introduce una opcion: ");
			
			byte opcion = entrada.nextByte();
			
			if(opcion>=1 && opcion<=9) {
				return opcion;
			}else {
				System.out.println("Error no puedes ingresar esa opcion, por favor vuelve a intentarlo");
			}
		}
	}


	public static void main(String[] args) {
		
		ListaEnlazada le = new ListaEnlazada();

		boolean candado = true;
		
		while(candado) {
			try {
				
				byte opcion = ingresarOpcion();
				byte subOpcion;

				switch(opcion) {

				case 1:
					
					subOpcion = ingresarSubOpcion();
					
					if(subOpcion==1) {
						System.out.println(le.agregarInicio(ingresarDato()));
					}else if(subOpcion==2) {
						System.out.println(le.agregarFin(ingresarDato()));
					}else {
						System.out.println(le.agregarEnPosicion(ingresarDato(), ingresarPosicionAgregar((byte)(le.getNumeroElementos()+1))));
					}
					break;

				case 2:
					subOpcion = ingresarSubOpcion();

					if(subOpcion==1) {
						System.out.println(le.eliminarInicio());
					}else if(subOpcion==2) {
						System.out.println(le.eliminarFin());
					}else {
						if(le.getNumeroElementos()!=0) {
							System.out.println(le.eliminarEnPosicion(ingresarPosicionEliminar((byte)le.getNumeroElementos())));
						}else {
							System.out.println("No hay elementos");
						}
					}
					break;

				case 3:
					System.out.println();
					le.verLista();
					System.out.println();
					break;
				
				case 4:
					le.buscarElemento(ingresarDato());
					break;
				
				case 5:
					le.vaciar();
					break;
				
				case 6:
					le.mostrarCantidadDeElementos();
					break;
				
				case 7:
					le.mostrarPrimero();
					break;
				
				case 8:
					le.mostrarUltimo();
					break;

				case 9:
					candado = false;
					System.out.println("\nPrograma terminado    :)");
					break;

				default:
					System.out.println("\nNo existe esa opcion, por favor vuelve a intentarlo");
					break;
				
				}
				
			}catch(InputMismatchException error){
				System.out.println("Error en la entrada de datos<" + error + ">, por favor vuelve a intentarlo");
			    entrada.nextLine();
			}

			System.out.println();

		}

	}
}
