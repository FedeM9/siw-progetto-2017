package it.uniroma3.siw.controller;

import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.siw.modello.Opera;
import it.uniroma3.siw.modello.Utente;
import it.uniroma3.siw.service.OperaService;
import it.uniroma3.siw.service.UtenteService;

@Controller
public class UtenteController {
	@Autowired
	UtenteService utenteService;
	@Autowired
	OperaService operaService;

	@PostMapping("/utenteLogin")
	public String checkUtenteInfo(@Valid @ModelAttribute Utente utente, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "Error"; //in caso di errore 
		}else{
			if(utenteService.findByUserName(utente.getUsername())==null){
				return "LoginUtente";
			}
		}

		model.addAttribute("nomeUtente",utente.getUsername());
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
	
	@ModelAttribute("opere")
	public Iterable<Opera> opere(){
		Iterable <Opera> itopere=  operaService.findAll();
		List<Opera> opere = new LinkedList<>();
		for(Opera o : itopere){
			opere.add(o);
		}
		return opere;
	}
}
