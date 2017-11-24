package pe.edu.unmsm.jmatos.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "tbl_reserva" )
public class Reserva {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column( name = "id" )
	private int id;
	
	@Column( name = "d_checking" )
	private Date checking;
	 
	@Column( name = "d_checkout" )
	private Date checkout;
	
	@Column( name = "n_adultos")
	private int numeroAdultos;
	
	@Column( name = "n_ninios" )
	private int numeroNinios;
	
	@Column( name = "n_estado" )
	private int estado;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn( name = "id_cliente" )
	private Cliente cliente;
	
	@OneToMany(mappedBy = "reservacion")
	private List<Habitacion> habitaciones;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getNumeroAdultos() {
		return numeroAdultos;
	}

	public void setNumeroAdultos(int numeroAdultos) {
		this.numeroAdultos = numeroAdultos;
	}

	public int getNumeroNinios() {
		return numeroNinios;
	}

	public void setNumeroNinios(int numeroNinios) {
		this.numeroNinios = numeroNinios;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * @return the habitaciones
	 */
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	/**
	 * @param habitaciones the habitaciones to set
	 */
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	
}
