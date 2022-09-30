package uap.usic.siga.entidades;

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
@Table(name = "oo_participantes")
public class OoParticipantes extends SigaUsicGestiones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idParticipante;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEquipoParticipante", referencedColumnName = "idEquipoParticipante")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private OoEquiposParticipantes ooEquiposParticipantes;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Personas personas;
	
	
	private String edad;
	private String imagen;
	
	
	
	
	public OoParticipantes() {

	}
	
	


	public OoParticipantes(Long idParticipante, OoEquiposParticipantes ooEquiposParticipantes, Personas personas,
			String edad, String imagen) {
		super();
		this.idParticipante = idParticipante;
		this.ooEquiposParticipantes = ooEquiposParticipantes;
		this.personas = personas;
		this.edad = edad;
		this.imagen = imagen;
	}












	public Personas getPersonas() {
		return personas;
	}



	public void setPersonas(Personas personas) {
		this.personas = personas;
	}



	public OoEquiposParticipantes getOoEquiposParticipantes() {
		return ooEquiposParticipantes;
	}


	public void setOoEquiposParticipantes(OoEquiposParticipantes ooEquiposParticipantes) {
		this.ooEquiposParticipantes = ooEquiposParticipantes;
	}



	public Long getIdParticipante() {
		return idParticipante;
	}



	public void setIdParticipante(Long idParticipante) {
		this.idParticipante = idParticipante;
	}



	



	public String getEdad() {
		return edad;
	}



	public void setEdad(String edad) {
		this.edad = edad;
	}



	


	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	
	
	
}
