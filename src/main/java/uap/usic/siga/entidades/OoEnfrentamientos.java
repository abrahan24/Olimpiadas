package uap.usic.siga.entidades;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "oo_enfrentamientos")
public class OoEnfrentamientos {
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEquipoParticipante", referencedColumnName = "idEquipoParticipante")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private OoEquiposParticipantes equiposParticipantes;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_encuentro", referencedColumnName = "id_encuentro")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private OoEncuentros ooEncuentros;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_etapa", referencedColumnName = "id_etapa")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private OoEtapas ooEtapas;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_enfrentamientos")
	private Long idEnfrentamientos;
	
	@Column(name = "encuentro")
	private Integer encuentro;

	@NotNull
    @DateTimeFormat(pattern = "yyy-MM-dd")
    @Column(name = "fec_encuentro")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecEncuentro;

	public OoEnfrentamientos() {
	}

	public Long getIdEnfrentamientos() {
		return idEnfrentamientos;
	}

	public void setIdEnfrentamientos(Long idEnfrentamientos) {
		this.idEnfrentamientos = idEnfrentamientos;
	}

	public OoEquiposParticipantes getEquiposParticipantes() {
		return equiposParticipantes;
	}

	public void setEquiposParticipantes(OoEquiposParticipantes equiposParticipantes) {
		this.equiposParticipantes = equiposParticipantes;
	}

	public Integer getEncuentro() {
		return encuentro;
	}

	public void setEncuentro(Integer encuentro) {
		this.encuentro = encuentro;
	}

	public Date getFecEncuentro() {
		return fecEncuentro;
	}

	public void setFecEncuentro(Date fecEncuentro) {
		this.fecEncuentro = fecEncuentro;
	}
	
	
}
