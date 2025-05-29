package archy.wiz.nrathtradingsbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import archy.wiz.nrathtradingsbackend.dao.ProjectDAO;
import archy.wiz.nrathtradingsbackend.dto.Projects;


@Transactional
@Repository("projectDAO")
public class ProjectDAOimpl implements ProjectDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Projects getProject(int id) {
		return sessionFactory.getCurrentSession().get(Projects.class, Integer.valueOf(id));
	}

	@Override
	public List<Projects> activeProjects() {
		return sessionFactory
				.getCurrentSession()
				    .createQuery("FROM Projects WHERE active = :active", Projects.class)
				        .setParameter("active", true)
				            .getResultList();  
	}

	@Override
	public boolean addProject(Projects project) {
		try {
			sessionFactory.getCurrentSession().persist(project);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProject(Projects project) {
		try {
			sessionFactory.getCurrentSession().update(project);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProject(Projects project) {
		project.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(project);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Projects> GetActiveProjectsByCategory(int categoryId) {
		return sessionFactory
				    .getCurrentSession()
				         .createQuery("FROM Projects WHERE active = :active AND categoryId = :categoryId", Projects.class)
				             .setParameter("active", true)
				                .setParameter("categoryId", categoryId)
				                    .getResultList();
	}

	@Override
	public List<Projects> getLatestActiveProjects(int count) {
		return sessionFactory
				 .getCurrentSession()
				      .createQuery("FROM Projects WHERE active = :active ORDER BY id", Projects.class)
				          .setParameter("active", true)
				              .setFirstResult(0)
				                .setMaxResults(count)
				                   .getResultList();	              
	}
	


	

}
