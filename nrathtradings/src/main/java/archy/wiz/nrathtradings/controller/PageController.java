package archy.wiz.nrathtradings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import archy.wiz.nrathtradingsbackend.dao.CategoryDAO;
import archy.wiz.nrathtradingsbackend.dao.CategoryInfoDAO;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private CategoryInfoDAO categoryInfoDAO;
	

	
	
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
		model.addObject("categories",categoryDAO.getActiveCategories());
		return model;
	}
	
	/*services single page*/
	@RequestMapping("/show/{categoryId}/category/det")
	public ModelAndView singlePageServices(@PathVariable int categoryId) {
		ModelAndView model = new ModelAndView("page");
		model.addObject("userClickSingleServices",true);
		model.addObject("categories",categoryDAO.getActiveCategories());
		model.addObject("categoryInfo", categoryInfoDAO.getActiveCategoryInfoByCategoryInfo(categoryId));
		return model;
	}
	
	@RequestMapping("/projects")
	public ModelAndView projects() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","our projects");
		model.addObject("userClickProjects",true);
		return model;
	}
	
	@RequestMapping("/gallery")
	public ModelAndView gallery() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title","our gallery");
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
