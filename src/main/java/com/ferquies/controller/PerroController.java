package com.ferquies.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ferquies.domain.Perro;
import com.ferquies.service.PerroService;

@Controller
public class PerroController {
	
	@Autowired
	private PerroService perroService;
	
	@RequestMapping(value = "/insertar", method=RequestMethod.GET)
	public String insertarPerro(Locale locale, Model model) {
		model.addAttribute("perro", new Perro());
		model.addAttribute("adoptadoCombo", perroService.getAdoptadoCombo());
		
		return "perros/insertarPerro";
	}
	
	@RequestMapping(value = "/insertar", method=RequestMethod.POST)
	public String insertarPerroPost(@ModelAttribute("perro") Perro perro, BindingResult result, Locale locale, Model model) {
		perroService.insertPerro(perro);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String verPerros(Locale locale, Model model) {
		model.addAttribute("perros", perroService.getAllPerrosList());
		
		return "perros/verPerro";
	}
	
	@RequestMapping(value = "/detalle/{id}", method=RequestMethod.GET)
	public String verPerros(Locale locale, Model model, @PathVariable int id) {
		Perro perro = perroService.getPerroById(id);
		
		model.addAttribute("perro", perro);
		
		return "perros/verPerro";
	}
	
	@RequestMapping(value = "/editar/{id}", method=RequestMethod.GET)
	public String modificarPerro(@PathVariable int id, Locale locale, Model model) {
		Perro perro = new Perro();
		perro.setId(id);
		
		perro = perroService.getPerroById(id);
		
		model.addAttribute("perro", perro);
		model.addAttribute("adoptadoCombo", perroService.getAdoptadoCombo());
		
		return "perros/modificarPerro";
	}
	
	@RequestMapping(value = "/editar", method=RequestMethod.POST)
	public String modificarPerroPost(@ModelAttribute("perro") Perro perro, BindingResult result, Locale locale, Model model) {
		perroService.updatePerro(perro);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/eliminar", method=RequestMethod.POST)
	public String eliminar(@RequestParam(value = "eliminarId", required = true) Integer eliminarId, Locale locale, Model model) {
		perroService.deletePerro(eliminarId);
		
		return "redirect:/";
	}

}
