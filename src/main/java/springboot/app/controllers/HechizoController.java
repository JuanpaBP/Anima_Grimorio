package springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springboot.app.services.HechizoTransformer;

@Controller
public class HechizoController {
	
	@Autowired
	private HechizoTransformer ht;
	
	@RequestMapping(value="/hechizos")
	public String listar(Model model)
	{
		model.addAttribute("titulo", "Hernan puto");
		model.addAttribute("via", ht.convertir().get(0).getVia());
		model.addAttribute("hechizos", ht.convertir());
		return "listaHechizos";
	}

}
