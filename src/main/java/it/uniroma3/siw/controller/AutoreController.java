package it.uniroma3.siw.controller;

import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.siw.modello.Autore;
import it.uniroma3.siw.modello.Opera;
import it.uniroma3.siw.service.AutoreService;

@Controller
public class AutoreController {
	@Autowired
	AutoreService autoreService;
	
    @GetMapping("/autore")
    public String showForm(Opera opera) {
        return "form";
    }

    @PostMapping("/addAutore")
    public String checkCustomerInfo(@Valid @ModelAttribute Autore autore, BindingResult bindingResult, Model model) {
    	
        if (bindingResult.hasErrors()) {
            return "OperazioniAdmin";
        } else {	
        	autoreService.add(autore); 
        	model.addAttribute("autori", autori());
        }
        return "OperazioniAdmin";
    }
    
	@ModelAttribute("autori")
	public Iterable<Autore> autori(){
		Iterable <Autore> itAutore = autoreService.findAll();
		List<Autore> autori = new LinkedList<>();
		for(Autore a : itAutore){
			autori.add(a);
		}
		return autori;
	}
}
