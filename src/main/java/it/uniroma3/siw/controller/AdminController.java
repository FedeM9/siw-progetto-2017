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

import it.uniroma3.siw.modello.Admin;
import it.uniroma3.siw.modello.Autore;
import it.uniroma3.siw.modello.Opera;
import it.uniroma3.siw.service.AdminService;
import it.uniroma3.siw.service.AutoreService;
import it.uniroma3.siw.service.OperaService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
	OperaService operaService;
	@Autowired
	AutoreService autoreService;

	@PostMapping("/adminLogin")
	public String checkUtenteInfo(@Valid @ModelAttribute Admin admin, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "LoginAdmin"; //in caso di errore 
		} else {
			if(adminService.findByUserName(admin.getUsername())==null) {
				return "LoginAdmin";
			} else {
				model.addAttribute("nomeAdmin",admin.getUsername());
			}
		}
		return "OperazioniAdmin";
	}
	
	@PostMapping("/adminReg")
	public String insertNewAdmin(@Valid @ModelAttribute Admin admin, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "RegistrazioneAdmin"; //in caso di errore 
		} else {
			model.addAttribute(admin);
			adminService.add(admin); 
		}

		return "OperazioniAdmin";
	}
	
	@PostMapping("/reload")
	public String reload(@Valid @ModelAttribute Admin admin, BindingResult bindingResult, Model model) {
		return "OperazioniAdmin";
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
	
	@ModelAttribute("autori")
	public Iterable<Autore> operi(){
		Iterable <Autore> itautori=  autoreService.findAll();
		List<Autore> autori = new LinkedList<>();
		for(Autore a : itautori){
			autori.add(a);
		}
		return autori;
	}
}