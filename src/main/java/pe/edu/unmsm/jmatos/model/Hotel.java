package pe.edu.unmsm.jmatos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "tbl_hotel" )
public class Hotel {

	@Id 
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int id;
	
	@Column( name = "c_nombre" )
	private String nombre;
	
	@Column( name = "n_estrellas")
	private int estrellas;
	
	@Column( name = "n_calificacion" )
	private double calificacion;
	
	@Column( name = "c_informacion" )
	private String informacion;
	
	@Column( name = "c_ubicacion" )
	private String ubicacion;
	
	@Column( name = "n_costonoche" )
	private double costoNocheMin;
	
	@Column( name = "n_id_destino" )
	private int idDestino;
	
	@OneToMany( mappedBy = "hotel" )
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
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	
}
