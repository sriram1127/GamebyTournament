package com.games.tournament.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("register")
public class RegistrationFormController {
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(String Players, String PlayersAge,
			String PlayersEmails) {

		return "Success";
	}
}
