package pe.edu.unmsm.jmatos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_habitacion_foto")
public class HabitacionFotografia {
 
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column( name = "id" )
	private int id;
	
	@Column( name = "c_ruta" )
	private String rutaFotografia;
	
	@Column( name = "c_title" )
	private String title;
	
	@Column( name = "c_descripcion" )
	private String descripcion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "n_id_habitacion" )
	private Habitacion habitacion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutaFotografia() {
		return rutaFotografia;
	}

	public void setRutaFotografia(String rutaFotografia) {
		this.rutaFotografia = rutaFotografia;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the habitacion
	 */
	public Habitacion getHabitacion() {
		return habitacion;
	}

	/**
	 * @param habitacion the habitacion to set
	 */
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

}
