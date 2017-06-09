package it.uniroma3.siw.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.siw.modello.Opera;
import it.uniroma3.siw.service.OperaService;

@Controller
public class OperaController {
	
	@Autowired
	OperaService operaService;
	
    @GetMapping("/opera")
    public String showForm(Opera opera) {
        return "form";
    }

    @PostMapping("/opera")
    public String checkCustomerInfo(@Valid @ModelAttribute Opera opera, 
    									BindingResult bindingResult, Model model) {
    	
        if (bindingResult.hasErrors()) {
            return "form";
        } else {
        	model.addAttribute(opera);
        	operaService.add(opera); 
        }
        return "results";
    }
}
