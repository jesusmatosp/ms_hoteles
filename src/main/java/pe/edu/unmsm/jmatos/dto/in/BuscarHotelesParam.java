package pe.edu.unmsm.jmatos.dto.in;

import java.sql.Date;

public class BuscarHotelesParam {

	private int idDestino;
	private Date checking;
	private Date checkout;
	private int tipoHabitacion;
	
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public Date getChecking() {
		return checking;
	}
	public void setChecking(Date checking) {
		this.checking = checking;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	public int getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(int tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
	
	
}
