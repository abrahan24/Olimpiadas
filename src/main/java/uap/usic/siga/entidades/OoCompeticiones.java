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
@Table(name = "oo_competiciones")
public class OoCompeticiones extends SigaUsicGestiones{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_competiciones")
	private Long idCompeticiones;
	
	@Column(name = "competicion")
	private String competicion;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	public OoCompeticiones() {
	}

	public Long getIdCompeticiones() {
		return idCompeticiones;
	}

	public void setIdCompeticiones(Long idCompeticiones) {
		this.idCompeticiones = idCompeticiones;
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	}
