package pe.edu.unmsm.jmatos.model;

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
@Table( name = "tbl_habitacion" )
public class Habitacion {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column( name = "n_id" )
	private int id;  
	
	@Column( name = "n_numero" )
	private int numero;
	
	@Column( name = "n_camas" )
	private int camas;
	
	@Column( name = "c_categoria" )
	private String categoria;
	
	@Column( name = "n_estado" )
	private int estado;
	
	@Column( name = "n_precio" )
	private double precio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_hotel")
	private Hotel hotel;
	
	@ManyToOne( fetch=FetchType.LAZY )
	@JoinColumn( name = "id_reservacion" )
	private Reserva reservacion;
	
	@OneToMany( mappedBy = "habitacion" )
	private List<HabitacionFotografia> fotografias;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCamas() {
		return camas;
	}
	public void setCamas(int camas) {
		this.camas = camas;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	/**
	 * @return the fotografias
	 */
	public List<HabitacionFotografia> getFotografias() {
		return fotografias;
	}
	/**
	 * @param fotografias the fotografias to set
	 */
	public void setFotografias(List<HabitacionFotografia> fotografias) {
		this.fotografias = fotografias;
	}
	
}
