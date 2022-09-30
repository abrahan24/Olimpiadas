package uap.usic.siga.servicios;

import java.util.List;

import uap.usic.siga.entidades.OoCompeticiones;
import uap.usic.siga.entidades.OoEncuentros;
import uap.usic.siga.entidades.OoEnfrentamientos;
import uap.usic.siga.entidades.OoEquiposParticipantes;
import uap.usic.siga.entidades.OoEtapas;
import uap.usic.siga.entidades.OoParticipantes;
import uap.usic.siga.entidades.OoUnidadesEducativas;
import uap.usic.siga.entidades.Personas;

public interface OlimpiadasServicios {
	
	public List<OoCompeticiones> listarCompeticiones();
	
	// ============ Modulo Unidades Educativas =============
	public List<OoUnidadesEducativas> listarUnidadesEducativas();
	 public OoUnidadesEducativas registrarUnidadesEducativas(OoUnidadesEducativas unidadesEducativas);
	 public OoUnidadesEducativas buscarUnidadesEducativas(Long idUnidadEducativa);
	 public OoUnidadesEducativas modificarUnidadesEducativas(OoUnidadesEducativas ooUnidadesEducativas);
	// ============ FIN =============
	
	// ============ Modulo Equipos =============
	public List<OoEquiposParticipantes> listarEquiposParticipantes();
	public OoEquiposParticipantes registrarEquiposParticipantes(OoEquiposParticipantes equiposParticipantes);
	public OoEquiposParticipantes modificarEquiposParticipantes(OoEquiposParticipantes equiposParticipantes);
	public OoEquiposParticipantes buscarEquiposParticipantes(Long idEquipoParticipante);
	
	// ============ Modulo Participantes =============
	public List<OoParticipantes> listarParticipantes();
	public OoParticipantes registrarParticipantes(OoParticipantes participantes);
	public OoParticipantes modificarParticipantes(OoParticipantes ooParticipantes);
	public OoParticipantes buscarParticipantes(Long idParticipante);
	
	// ============ Modulo Enfrentamientos =============
	public List<OoEncuentros> listarOoEncuentros();
	public List<OoEtapas> listarOoEtapas();
	
	public List<OoEnfrentamientos> listarOoEnfrentamientosPorIdEtapa(Long idEtapa);
	
	
}
