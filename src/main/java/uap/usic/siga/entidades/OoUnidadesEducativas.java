package uap.usic.siga.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "oo_unidades_educativas")
public class OoUnidadesEducativas extends SigaUsicGestiones{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_unidad_educativa")
	private Long idUnidadEducativa;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_competiciones", referencedColumnName = "id_competiciones")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private OoCompeticiones ooCompeticiones;
	
	private String nombre;
	private String descripcion;
	private String imagen;
	
	
	public OoUnidadesEducativas() {
	
	}
	
	


	public OoUnidadesEducativas(Long idUnidadEducativa, OoCompeticiones ooCompeticiones, String nombre,
			String descripcion, String imagen) {
		super();
		this.idUnidadEducativa = idUnidadEducativa;
		this.ooCompeticiones = ooCompeticiones;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}




	public Long getIdUnidadEducativa() {
		return idUnidadEducativa;
	}
	public void setIdUnidadEducativa(Long idUnidadEducativa) {
		this.idUnidadEducativa = idUnidadEducativa;
	}
	
	public OoCompeticiones getOoCompeticiones() {
		return ooCompeticiones;
	}




	public void setOoCompeticiones(OoCompeticiones ooCompeticiones) {
		this.ooCompeticiones = ooCompeticiones;
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
	
	
}
