package pe.edu.unmsm.jmatos.exception;

@SuppressWarnings("serial")
public class HotelesNotFound extends Exception {

	public HotelesNotFound(){
		super("La Busqueda de Hoteles No obtuvo ningún Resultado");
	}
	
}
 