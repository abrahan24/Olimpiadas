package uap.usic.siga.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import uap.usic.siga.dto.UserDto;
import uap.usic.siga.entidades.OoUnidadesEducativas;
import uap.usic.siga.servicios.OlimpiadasServicios;

import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by Keno&Kemo on 30.09.2017..
 */

@Controller
@RequestMapping("")
public class IndexController {

    @Autowired
    private OlimpiadasServicios olimpiadas;

    @GetMapping(value = {"/", "/index"})
    public String index (){
        return "website/index";
    }

    @GetMapping(value = "/login")
    public String login (){
        return "website/login";
    }

    @GetMapping(value = "/register")
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDto", userDto);
        return "website/register";
    }

    @GetMapping(value = "/inicio")
    public String Principal(){

        return "zelda/index";
    }
    @GetMapping(value = "/seleccion")
    public String SelectEquipo(Model model){
        model.addAttribute("unidades_educativas", olimpiadas.listarUnidadesEducativas());
        return "zelda/coming-soon";
    }
    /* 
    @PostMapping(value = "/inicioForm")
	public String inicioFormUnidadesEducativas(@ModelAttribute("ooUnidadesEducativas") OoUnidadesEducativas ooUnidadesEducativas , Model model, HttpSession session) {
	      
	      model.addAttribute("lComp", olimpiadas.listarCompeticiones());
	    
	      return "zelda/coming-soon";
	}
    */
}
