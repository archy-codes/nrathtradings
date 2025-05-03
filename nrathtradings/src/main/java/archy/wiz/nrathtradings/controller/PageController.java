package archy.wiz.nrathtradings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","home");
		model.addObject("userClickHome",true);
		return model;
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","about us");
		model.addObject("userClickAbout",true);
		return model;
	}
	
	@RequestMapping("/services")
	public ModelAndView services() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","our services");
		model.addObject("userClickServices",true);
		return model;
	}
	
	@RequestMapping("/projects")
	public ModelAndView projects() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","our projects");
		model.addObject("userClickProjects",true);
		return model;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("userClickContact", true);
		return model;
	}

}
