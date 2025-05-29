package archy.wiz.nrathtradingsbackend.dao;

import java.util.List;

import archy.wiz.nrathtradingsbackend.dto.CategoryInfo;

public interface CategoryInfoDAO {
	
	CategoryInfo get(int id);
	
	List<CategoryInfo> listActiveCategoryInfo();
	
	List<CategoryInfo> getActiveCategoryInfoByCategoryInfo(int categoryId);
	
	boolean add(CategoryInfo categoryInfo);
	boolean update(CategoryInfo categoryInfo);
	boolean delete(CategoryInfo categoryInfo);

}
