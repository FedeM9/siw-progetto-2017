package it.uniroma3.siw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// controller to access the login page
@Controller
public class MainController {

  // Login form
  @RequestMapping("/formLoginUtente.html")
  public String login() {
    return "formLoginUtente";
  }

  // Login form with error
  @RequestMapping("/Error.html")
  public String loginError(Model model) {
    model.addAttribute("Error", true);
    return "formLoginUtente";
  }

}