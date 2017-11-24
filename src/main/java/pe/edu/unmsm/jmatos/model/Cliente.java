package pe.edu.unmsm.jmatos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "tbl_cliente" )
public class Cliente {
	 
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column( name = "n_id" )
	private int id;
	
	@Column( name = "c_nombres" )
	private String nombres;
	
	@Column( name = "c_apellidos" )
	private String apellidos;
	
	@Column( name = "c_dni" )
	private String dni;
	
	@Column( name = "c_celular" )
	private String celular;
	
	@Column( name = "c_correo" )
	private String correo;
	
	@OneToMany( mappedBy = "cliente" )
	private List<Reserva> reservaciones;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the reservaciones
	 */
	public List<Reserva> getReservaciones() {
		return reservaciones;
	}
	/**
	 * @param reservaciones the reservaciones to set
	 */
	public void setReservaciones(List<Reserva> reservaciones) {
		this.reservaciones = reservaciones;
	}
	
}
