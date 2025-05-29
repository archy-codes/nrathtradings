package archy.wiz.nrathtradingsbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import archy.wiz.nrathtradingsbackend.dao.CategoryInfoDAO;
import archy.wiz.nrathtradingsbackend.dto.CategoryInfo;


@Transactional
@Repository("categoryInfoDAO")
public class CategoryInfoDAOImpl implements CategoryInfoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public CategoryInfo get(int id) {
		return sessionFactory.getCurrentSession().get(CategoryInfo.class, Integer.valueOf(id));
	}

	@Override
	public List<CategoryInfo> listActiveCategoryInfo() {
		return sessionFactory
				   .getCurrentSession()
				       .createQuery("FROM CategoryInfo WHERE  isActive = :isActive",CategoryInfo.class)
				           .setParameter("isActive", true)
				               .getResultList();
	}

	@Override
	public List<CategoryInfo> getActiveCategoryInfoByCategoryInfo(int categoryId) {
		return sessionFactory
				  .getCurrentSession()
				     .createQuery("FROM CategoryInfo WHERE isActive = :isActive AND categoryId = :categoryId", CategoryInfo.class)
				        .setParameter("isActive", true)
				           .setParameter("categoryId", categoryId)
				              .getResultList();
	}

	@Override
	public boolean add(CategoryInfo categoryInfo) {
		try {
			sessionFactory.getCurrentSession().persist(categoryInfo);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(CategoryInfo categoryInfo) {
		try {
			sessionFactory.getCurrentSession().update(categoryInfo);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(CategoryInfo categoryInfo) {
		categoryInfo.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(categoryInfo);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
