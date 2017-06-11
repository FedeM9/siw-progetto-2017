package it.uniroma3.siw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// controller to access the login page
@Controller
public class MainController {

	// Login form
	@RequestMapping("/LoginUtente.html")
	public String login() {
		return "LoginUtente";
	}

	// Login form with error
	@RequestMapping("/Error.html")
	public String loginError(Model model) {
		model.addAttribute("Error", true);
		return "LoginUtente";
	}

	//Register form
	@RequestMapping("/RegistrazioneUtente.html")
	public String registerU() {
		return "RegistrazioneUtente";
	}
	
	@RequestMapping("/LoginAdmin.html")
	public String loginAdmin() {
		return "LoginAdmin";
	}
	
	@RequestMapping("/RegistrazioneAdmin.html")
	public String registerA() {
		return "RegistrazioneAdmin";
	}
	
}