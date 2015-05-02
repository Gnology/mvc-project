package com.gnology.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController{
	@RequestMapping("/test/model")
	public String modelMethod(Model model){
		model.addAttribute("message", "moja wiadomosc");
		return "glowny";
	}
}