package pe.edu.unmsm.jmatos.exception;

@SuppressWarnings("serial")
public class DestinoIdEmptyException extends Exception {

	public DestinoIdEmptyException() {
		super("El identificador del Destino no puede estar vacío");
	}
	
}
 