package demo.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiRest {

	@RequestMapping(value = "/publico", method = RequestMethod.GET) 
	public String Api()
	{
		return "Succes";
	}

	
	@RequestMapping(value = "/privado", method = RequestMethod.GET) 
	public String Apiprivado()
	{
		return "Succes";
	}
	
	
	
}
