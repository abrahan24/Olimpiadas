package uap.usic.siga.servicios.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uap.usic.siga.entidades.Personas;

import uap.usic.siga.entidades.PrsCiExpedidos;

import uap.usic.siga.entidades.PrsPaises;
import uap.usic.siga.entidades.PrsTiposSexos;

import uap.usic.siga.modelos.PersonasDao;
import uap.usic.siga.servicios.PersonasServicios;

/**
 *
 * @author fmbma
 */
@Service("personasServicios")
@Transactional
public class PersonasServiciosImpl implements PersonasServicios {

    @Autowired
    private PersonasDao dao;

    @Override
    public List<Personas> listarPersonas() {
        return dao.listarPersonasGET();
    }

    @Override
    public List<PrsPaises> listarPaises() {
        return dao.listarPaisesGET();
    }

    @Override
    public void registrarPersonas(Personas personas) {
        dao.registrarPersonasSET(personas);
    }

    @Override
    public List<Object[]> listarPersonasPorCi() {
        return dao.listarPersonasPorCiJPQL();
    }

    @Override
    public Personas buscarPersonasPorCedulaIdentidad(String ci) {
        return dao.buscarPersonasPorCedulaIdentidadGET(ci);
    }

    @Override
    public Personas buscarPersonaPorIdUsuario(Long idUsuario) {
        return dao.buscarPersonaPorIdUsuarioGET(idUsuario);
    }

    @Override
    public void registrarPrsPaises(PrsPaises prsPaises) {
        dao.registrarPrsPaisesSET(prsPaises);
    }

    @Override
    public List<PrsTiposSexos> listarTiposSexos() {
        return dao.listarTiposSexosJPQL();
    }

    @Override
    public void registrarPrsTiposSexos(PrsTiposSexos prsTiposSexos) {
        dao.registrarPrsTiposSexosSET(prsTiposSexos);
    }

    @Override
    public void modificarPersonas(Personas personas) {
        dao.modificarPersonasSET(personas);
    }

    @Override
    public void eliminarPersonas(Personas personas) {
        dao.eliminarPersonasSET(personas);
    }

    @Override
    public Personas buscarPersonasPorIdPersona(Long idPersona) {
        return dao.buscarPersonasPorIdPersonaGET(idPersona);
    }

    @Override
    public List<PrsCiExpedidos> listarCedulaIdentidadexpedidos() {
        return dao.listarCedulaIdentidadexpedidosJPQL();
    }

    @Override
    public void registrarPrsCedulaIdentidadExpedidos(PrsCiExpedidos prsCiExpedidos) {
        dao.registrarPrsCedulaIdentidadExpedidosSET(prsCiExpedidos);
    }

    
    @Override
    public Personas buscarPersonasPorIdCjaGastoEjecutado(Long idCjaGastoEjecutado) {
        return dao.buscarPersonasPorIdCjaGastoEjecutadoGET(idCjaGastoEjecutado);
    }

    @Override
    public Personas buscarPersonasPorIdCjaIngresoGET(Long idCjaIngreso) {
        return dao.buscarPersonasPorIdCjaIngresoGET(idCjaIngreso);
    }

    @Override
    public List<Personas> listarCjaGastosEjecutadosPersonasPorIdCjaIngresoIdUsuario(Long idCjaIngreso, Long idUsuario) {
        return dao.listarCjaGastosEjecutadosPersonasPorIdCjaIngresoIdUsuarioJPQL(idCjaIngreso, idUsuario);
    }

    @Override
    public List<Personas> listarPersonasComprobantes() {
        return dao.listarPersonasComprobantesJPQL();
    }

    @Override
    public Personas buscarPersonasComprobantesPorIdPersona(Long idPersona) {
        return dao.buscarPersonasComprobantesPorIdPersonaGET(idPersona);
    }



	@Override
	public List<Personas> listarPersonalAdministrativoPorGestion(Integer gestion) {
		return dao.listarPersonalAdministrativoPorGestionJPQL(gestion);
	}
}
