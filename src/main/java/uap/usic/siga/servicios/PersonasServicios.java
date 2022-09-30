package uap.usic.siga.servicios;

import java.util.List;

import uap.usic.siga.entidades.Personas;

import uap.usic.siga.entidades.PrsCiExpedidos;

import uap.usic.siga.entidades.PrsPaises;
import uap.usic.siga.entidades.PrsTiposSexos;


/**
 *
 * @author fmbma
 */
public interface PersonasServicios {

    public List<Personas> listarPersonas();

    public List<PrsPaises> listarPaises();

    void registrarPersonas(Personas personas);

    public List<Object[]> listarPersonasPorCi();

    public Personas buscarPersonasPorCedulaIdentidad(String ci);

    public Personas buscarPersonaPorIdUsuario(Long idUsuario);

    public void registrarPrsPaises(PrsPaises prsPaises);

    public List<PrsTiposSexos> listarTiposSexos();

    public void registrarPrsTiposSexos(PrsTiposSexos prsTiposSexos);

    public void modificarPersonas(Personas personas);

    public void eliminarPersonas(Personas personas);

    public Personas buscarPersonasPorIdPersona(Long idPersona);

    public List<PrsCiExpedidos> listarCedulaIdentidadexpedidos();

    public void registrarPrsCedulaIdentidadExpedidos(PrsCiExpedidos prsCiExpedidos);

   

    public Personas buscarPersonasPorIdCjaGastoEjecutado(Long idCjaGastoEjecutado);

    public Personas buscarPersonasPorIdCjaIngresoGET(Long idCjaIngreso);

    public List<Personas> listarCjaGastosEjecutadosPersonasPorIdCjaIngresoIdUsuario(Long idCjaIngreso, Long idUsuario);

    public List<Personas> listarPersonasComprobantes();

    public Personas buscarPersonasComprobantesPorIdPersona(Long idPersona);

    

    public List<Personas> listarPersonalAdministrativoPorGestion(Integer gestion);
}
