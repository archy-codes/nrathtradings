package archy.wiz.nrathtradingsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import archy.wiz.nrathtradingsbackend.dao.CategoryDAO;
import archy.wiz.nrathtradingsbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	
	@BeforeClass
	public void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("archy.wiz.nrathtradingsbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void JunitTestCategory() {
		
		category = new Category();
		category.setCategoryName("CIVIL WORKS");
		category.setUserAdminId(1);
		assertEquals("you have successfully added a category",true,categoryDAO.addCategory(category));
		
		category = new Category();
		category.setCategoryName("GENERAL BUILDING CONSTRUCTION & MAINTANANCE");
		category.setUserAdminId(1);
		assertEquals("you have successfully added a category",true,categoryDAO.addCategory(category));
		
		category = new Category();
		category.setCategoryName("WATER EXPERIENCE");
		category.setUserAdminId(1);
		assertEquals("you have successfully added a category",true,categoryDAO.addCategory(category));
		
		category = categoryDAO.getCategory(3);
		assertEquals("you have successfully fetched a category by its id","WATER EXPERIENCE", category.getCategoryName());
		
		category = categoryDAO.getCategory(3);
		category.setCategoryName("MAINTENANCE");
		assertEquals("you have successfully updated a category",true,categoryDAO.updateCategory(category));
		
		category = categoryDAO.getCategory(3);
		assertEquals("you have successfully updated a category",true,categoryDAO.deleteCategory(category));
		
		
	}

}
