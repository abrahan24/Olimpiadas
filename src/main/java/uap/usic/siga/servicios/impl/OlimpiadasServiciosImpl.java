package uap.usic.siga.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uap.usic.siga.entidades.OoCompeticiones;
import uap.usic.siga.entidades.OoEncuentros;
import uap.usic.siga.entidades.OoEnfrentamientos;
import uap.usic.siga.entidades.OoEquiposParticipantes;
import uap.usic.siga.entidades.OoEtapas;
import uap.usic.siga.entidades.OoParticipantes;
import uap.usic.siga.entidades.OoUnidadesEducativas;
import uap.usic.siga.entidades.Personas;
import uap.usic.siga.modelos.OlimpiadasDao;
import uap.usic.siga.servicios.OlimpiadasServicios;

@Service("olimpiasasServicio")
@Transactional
public class OlimpiadasServiciosImpl implements OlimpiadasServicios {

	@Autowired
	private OlimpiadasDao dao;

	@Override
	public List<OoCompeticiones> listarCompeticiones() {
		
		return dao.listarCompeticionesJPQL();
	}

	@Override
	public List<OoUnidadesEducativas> listarUnidadesEducativas() {
		
		return dao.listarUnidadesEducativasJPQL();
	}

	@Override
	public OoUnidadesEducativas registrarUnidadesEducativas(OoUnidadesEducativas unidadesEducativas) {
	
		return dao.registrarUnidadesEducativasSET(unidadesEducativas);
	}

	@Override
	public OoUnidadesEducativas buscarUnidadesEducativas(Long idUnidadEducativa) {
		
		return dao.buscarUnidadesEducativasGET(idUnidadEducativa);
	}

	@Override
	public List<OoEquiposParticipantes> listarEquiposParticipantes() {
	
		return dao.listarEquiposParticipantesJPQL();
	}

	@Override
	public OoEquiposParticipantes registrarEquiposParticipantes(OoEquiposParticipantes equiposParticipantes) {
		
		return dao.registrarEquiposParticipantesSET(equiposParticipantes);
	}

	@Override
	public OoEquiposParticipantes modificarEquiposParticipantes(OoEquiposParticipantes equiposParticipantes) {
		
		return dao.modificarEquiposParticipantesSET(equiposParticipantes);
	}

	@Override
	public OoEquiposParticipantes buscarEquiposParticipantes(Long idEquipoParticipante) {
		
		return dao.buscarEquiposParticipantesGET(idEquipoParticipante);
	}

	@Override
	public List<OoParticipantes> listarParticipantes() {
		
		return dao.listarParticipantesJPQL();
	}

	@Override
	public OoParticipantes registrarParticipantes(OoParticipantes participantes) {

		return dao.registrarParticipantesSET(participantes);
	}

	@Override
	public OoUnidadesEducativas modificarUnidadesEducativas(OoUnidadesEducativas ooUnidadesEducativas) {
		
		return dao.modificarUnidadesEducativasSET(ooUnidadesEducativas);
	}

	@Override
	public OoParticipantes modificarParticipantes(OoParticipantes ooParticipantes) {
		
		return dao.modificarParticipantesSET(ooParticipantes);
	}

	@Override
	public OoParticipantes buscarParticipantes(Long idParticipante) {
		
		return dao.buscarParticipantesGET(idParticipante);
	}
	
	@Override
	public List<OoEncuentros> listarOoEncuentros() {
		return dao.listarOoEncuentrosJPQL();
	}

	@Override
	public List<OoEtapas> listarOoEtapas() {
		return dao.listarOoEtapasJPQL();
	}

	@Override
	public List<OoEnfrentamientos> listarOoEnfrentamientosPorIdEtapa(Long idEtapa) {
		return dao.listarOoEnfrentamientosPorIdEtapaJQPL(idEtapa);
	}

	
	
	
	

}
