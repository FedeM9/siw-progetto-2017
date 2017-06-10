package it.uniroma3.siw.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.siw.modello.Utente;
import it.uniroma3.siw.service.UtenteService;

@Controller
public class UtenteController {
	@Autowired
	UtenteService utenteService;
	
	@PostMapping("/utenteLogin")
    public String checkUtenteInfo(@Valid @ModelAttribute Utente utente, BindingResult bindingResult, Model model) {
    	
        if (bindingResult.hasErrors()) {
            return "Error"; //in caso di errore 
        }
        return "LoginUtenteEffettuato";
    }
	@PostMapping("/utenteReg")
    public String insertNewUtente(@Valid @ModelAttribute Utente utente, BindingResult bindingResult, Model model) {
    	
        if (bindingResult.hasErrors()) {
            return "Error"; //in caso di errore 
        } else {
        	model.addAttribute(utente);
        	utenteService.add(utente); 
        }
        return "LoginUtenteEffettuato";
    }
}
