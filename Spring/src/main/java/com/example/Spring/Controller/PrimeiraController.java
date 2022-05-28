package com.example.Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimeiraController 
{
	@RequestMapping(path="/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping(path="/pagina2")
	public ModelAndView pagina2()
	{
		return new ModelAndView();
	}
	
	@RequestMapping(path="/pagina3")
	public String pagina3()
	{
		return "pagina3";
	}
}

