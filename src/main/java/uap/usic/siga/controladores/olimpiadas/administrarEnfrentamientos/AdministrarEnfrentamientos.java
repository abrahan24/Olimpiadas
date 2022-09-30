package uap.usic.siga.controladores.olimpiadas.administrarEnfrentamientos;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uap.usic.siga.entidades.OoEquiposParticipantes;
import uap.usic.siga.servicios.OlimpiadasServicios;

@Controller
@RequestMapping("/enfrenta")
public class AdministrarEnfrentamientos {

	@Autowired
	private OlimpiadasServicios oServicios; 
	
	@GetMapping("/listEtapas")
	public String listarEtapas( Model model, HttpSession session) {
		model.addAttribute("busqueda", "etapa");
		model.addAttribute("lEtapas", oServicios.listarOoEtapas());
		return "uap/usic/siga/olimpiadas/administrarEnfrentamientos/administrarEnfrenta";
	}
	
	@PostMapping(value = "/listarEnfrentamiento")
	public String listarEnfrentamientos(@RequestParam("idEtapa") Long idEtapa, Model model, HttpSession session) {
		model.addAttribute("busqueda", "find");
	      model.addAttribute("lEnfrentamientos", oServicios.listarOoEnfrentamientosPorIdEtapa(idEtapa));
	      return "uap/usic/siga/olimpiadas/administrarEnfrentamientos/administrarEnfrentamiento";
	}

	
	// ========= Muestra Formulario ===================
	@PostMapping(value = "/inicioForm")
	public String inicioFormEquipoParticipantes(@ModelAttribute("equipos_participantes") OoEquiposParticipantes equiposParticipantes , Model model, HttpSession session) {
	      model.addAttribute("operation", "reg");
	     // model.addAttribute("lComp", eqpServicios.listarCompeticiones());
	      return "uap/usic/siga/olimpiadas/administrarEquiposParticipantes/admEquiposParticipantes";
	}


}
