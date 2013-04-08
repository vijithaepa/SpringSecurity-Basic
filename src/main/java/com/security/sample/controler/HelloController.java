package com.security.sample.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author vijitha Epa
 * @since 08-04-13.
 * 
 * Simple Controller class to handle incoming requests.
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring Security with Basic Authentication");
		return "hello";

	}

}
