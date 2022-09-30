package uap.usic.siga.controladores.administrarPersonas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import uap.usic.siga.entidades.OoEquiposParticipantes;
import uap.usic.siga.entidades.OoParticipantes;
import uap.usic.siga.entidades.OoUnidadesEducativas;
import uap.usic.siga.entidades.Personas;
import uap.usic.siga.servicios.OlimpiadasServicios;
import uap.usic.siga.servicios.PersonasServicios;


@Controller
@RequestMapping("/personas")
public class AdministrarPersonas {


	
	@Autowired
	private PersonasServicios pServicios; 
	
	@GetMapping("/admPersonas")
	public String inicioPersonas( Model model, HttpSession session) {
		model.addAttribute("busqueda", "find");
		model.addAttribute("lPersonas", pServicios.listarPersonas());
		return "uap/usic/siga/olimpiadas/administrarPersonas/admPersonas";
	}
	
	// ========= Muestra Formulario ===================
	@PostMapping(value = "/inicioForm")
	public String inicioFormPersonas(@ModelAttribute("personas") Personas personas , Model model, HttpSession session) {
	      model.addAttribute("operation", "reg");
	      model.addAttribute("lTipoSexo", pServicios.listarTiposSexos());
	      model.addAttribute("lCedulaI", pServicios.listarCedulaIdentidadexpedidos());
	      return "uap/usic/siga/olimpiadas/administrarPersonas/admPersonas";
	}

	// ===================== Guardar Datos en BD =========
	@PostMapping(value = "/registroParticipantes")
	public String registrarParticipantes(@Valid @ModelAttribute("personas")  Personas personas, BindingResult result, HttpSession session, Model model) throws IOException {
		if (result.hasErrors()) {
			  model.addAttribute("operation", "reg");
			  model.addAttribute("lTipoSexo", pServicios.listarTiposSexos());
		      model.addAttribute("lCedulaI", pServicios.listarCedulaIdentidadexpedidos());
			 
		      return "uap/usic/siga/olimpiadas/administrarPersonas/admPersonas";
		}
		
		
		
		pServicios.registrarPersonas(personas);

		model.addAttribute("busqueda", "find");
		model.addAttribute("lPersonas", pServicios.listarPersonas());
		return "uap/usic/siga/olimpiadas/administrarPersonas/admPersonas";
	}

	@GetMapping(value = "/inicioModPersonas/{id}")
	public String inicioFormModPersonas(@ModelAttribute("personas") Personas personas , 
			@PathVariable("id") long idPersona, Model model, HttpSession session) {
			
		  model.addAttribute("personas", pServicios.buscarPersonasPorIdPersona(idPersona));
	      model.addAttribute("operation", "modf");
	      model.addAttribute("lTipoSexo", pServicios.listarTiposSexos());
	      model.addAttribute("lCedulaI", pServicios.listarCedulaIdentidadexpedidos());
	      
	      return "uap/usic/siga/olimpiadas/administrarPersonas/admPersonas";
	}
	
	@PostMapping(value = "/modificarPersonas")
	public String modificarPersonas(@Valid @ModelAttribute("personas") Personas personas, BindingResult result, HttpSession session, Model model) throws IOException {
		if (result.hasErrors()) {
			 model.addAttribute("personas", pServicios.buscarPersonasPorIdPersona(null));
		      model.addAttribute("operation", "modf");
		      model.addAttribute("lTipoSexo", pServicios.listarTiposSexos());
		      model.addAttribute("lCedulaI", pServicios.listarCedulaIdentidadexpedidos());
		      
		      return "uap/usic/siga/olimpiadas/administrarPersonas/admPersonas";
		}
		
	   pServicios.modificarPersonas(personas); 

		model.addAttribute("busqueda", "find");
		model.addAttribute("lTipoSexo", pServicios.listarTiposSexos());
	    model.addAttribute("lCedulaI", pServicios.listarCedulaIdentidadexpedidos());
	      
		return "uap/usic/siga/olimpiadas/administrarPersonas/admPersonas";
	}

}
