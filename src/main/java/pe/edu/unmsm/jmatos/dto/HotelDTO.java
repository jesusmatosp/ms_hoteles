package pe.edu.unmsm.jmatos.dto;

import java.util.List;

import pe.edu.unmsm.jmatos.model.Habitacion;

public class HotelDTO {

	private int id;
	private String nombre;
	private int estrellas;
	private double calificacion;
	private String informacion;
	private String ubicacion;
	private double costoNocheMin;
	private int idDestino;
	private List<Habitacion> habitaciones;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public String getInformacion() {
		return informacion;
	}
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getCostoNocheMin() {
		return costoNocheMin;
	}
	public void setCostoNocheMin(double costoNocheMin) {
		this.costoNocheMin = costoNocheMin;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
}
