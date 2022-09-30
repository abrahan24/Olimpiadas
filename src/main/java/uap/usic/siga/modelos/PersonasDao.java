package uap.usic.siga.modelos;

import java.util.List;


import uap.usic.siga.entidades.Personas;

import uap.usic.siga.entidades.PrsCiExpedidos;

import uap.usic.siga.entidades.PrsPaises;
import uap.usic.siga.entidades.PrsTiposSexos;


/**
 *
 * @author fmbma
 */
public interface PersonasDao {

    public List<Personas> listarPersonasGET();

    public List<PrsPaises> listarPaisesGET();

    void registrarPersonasSET(Personas personas);

    public List<Object[]> listarPersonasPorCiJPQL();

    public Personas buscarPersonasPorCedulaIdentidadGET(String ci);

    public Personas buscarPersonaPorIdUsuarioGET(Long idUsuario);

    public void registrarPrsPaisesSET(PrsPaises prsPaises);

    public List<PrsTiposSexos> listarTiposSexosJPQL();

    public void registrarPrsTiposSexosSET(PrsTiposSexos prsTiposSexos);

    public void modificarPersonasSET(Personas personas);

    public void eliminarPersonasSET(Personas personas);

    public Personas buscarPersonasPorIdPersonaGET(Long idPersona);

    public List<PrsCiExpedidos> listarCedulaIdentidadexpedidosJPQL();

    public void registrarPrsCedulaIdentidadExpedidosSET(PrsCiExpedidos prsCiExpedidos);

   
   

    public Personas buscarPersonasPorIdCjaGastoEjecutadoGET(Long idCjaGastoEjecutado);

    public Personas buscarPersonasPorIdCjaIngresoGET(Long idCjaIngreso);

    public List<Personas> listarCjaGastosEjecutadosPersonasPorIdCjaIngresoIdUsuarioJPQL(Long idCjaIngreso, Long idUsuario);
    
    public List<Personas> listarPersonasComprobantesJPQL();
    
    public Personas buscarPersonasComprobantesPorIdPersonaGET(Long idPersona);
    

    
    
    // ============= Poais
    public List<Personas> listarPersonalAdministrativoPorGestionJPQL(Integer gestion);
    
    
}
