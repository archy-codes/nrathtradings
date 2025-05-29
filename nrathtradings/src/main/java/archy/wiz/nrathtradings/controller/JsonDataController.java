package archy.wiz.nrathtradings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import archy.wiz.nrathtradingsbackend.dao.CategoryDAO;
import archy.wiz.nrathtradingsbackend.dao.CategoryInfoDAO;
import archy.wiz.nrathtradingsbackend.dao.ProjectDAO;
import archy.wiz.nrathtradingsbackend.dto.Category;
import archy.wiz.nrathtradingsbackend.dto.CategoryInfo;
import archy.wiz.nrathtradingsbackend.dto.Projects;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private CategoryInfoDAO categoryInfoDAO;
	
	@Autowired
	private ProjectDAO projectDAO;
	
	
	/*SHOW JSON FOR CATEGORY */
	@RequestMapping("/all/categories")
	@ResponseBody
	public List<Category> getActiveCategories(){
		return categoryDAO.getActiveCategories();
	}
	
	@RequestMapping("/show/{id}/category")
	@ResponseBody
	public Category getCategory(@PathVariable int id){
		return categoryDAO.getCategory(id);
	}
	
	
	/*SHOW INFO JSON CATEGORIES DETAILS EXTENDS */
	@RequestMapping("/show/all/categories")
	@ResponseBody
	public List<CategoryInfo> listActiveCategoryInfo(){
		return categoryInfoDAO.listActiveCategoryInfo();
	}
	@RequestMapping("/show/{categoryId}/category/det")
	@ResponseBody
	public CategoryInfo get(@PathVariable int categoryId) {
		return categoryInfoDAO.get(categoryId);
	}
	
	
	/*PROJECTS DETAILS JSON */
	@RequestMapping("/show/all/projects")
	@ResponseBody
	public List<Projects> activeProjects(){
		return projectDAO.activeProjects();
	}
	
	@RequestMapping("/show/{id}/projects")
	@ResponseBody
	public List<Projects> GetActiveProjectsByCategory(@PathVariable int categoryId) {
		return projectDAO.GetActiveProjectsByCategory(categoryId);
	}
	
	@RequestMapping("/show/projects/det")
	@ResponseBody
	public List<Projects> getLatestActiveProjects() {
		return projectDAO.getLatestActiveProjects(6);
	}
	
	

}
