package archy.wiz.nrathtradingsbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import archy.wiz.nrathtradingsbackend.dao.CategoryDAO;
import archy.wiz.nrathtradingsbackend.dto.Category;

@Transactional
public class CategoryDAOimpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Category getCategory(int id) {
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public List<Category> getCategory() {
		String query = "FROM Category WHERE active = :active";
		return sessionFactory
				 .getCurrentSession()
				      .createQuery(query, Category.class)
				          .setParameter("active", true)
				              .getResultList();
	}

	@Override
	public boolean addCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCategory(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
