package archy.wiz.nrathtradingsbackend.dao;

import java.util.List;

import archy.wiz.nrathtradingsbackend.dto.Category;

public interface CategoryDAO {

	///getting category by its id
	Category getCategory(int id);
	
	//getting a list of active categories
	List<Category> getActiveCategories();
	
	//upload a single category
	boolean addCategory(Category category);
	
	//updating a single category
	boolean updateCategory(Category category);
	
	//delete a single category
	boolean deleteCategory(Category category);
	
}
