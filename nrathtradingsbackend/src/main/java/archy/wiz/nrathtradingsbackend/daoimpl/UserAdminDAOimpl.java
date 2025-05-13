package archy.wiz.nrathtradingsbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import archy.wiz.nrathtradingsbackend.dao.UserAdminDAO;
import archy.wiz.nrathtradingsbackend.dto.UserAdmin;

@Transactional
public class UserAdminDAOimpl implements UserAdminDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public UserAdmin getUserAdmin(int id) {
		return sessionFactory.getCurrentSession().get(UserAdmin.class, Integer.valueOf(id));
	}

	@Override
	public List<UserAdmin> getUsers() {
		String query = "FROM UserAdmin WHERE active = :active";
		return sessionFactory
				  .getCurrentSession()
				       .createQuery(query, UserAdmin.class)
				           .setParameter("active", true)
				               .getResultList();
	}

	@Override
	public boolean addUser(UserAdmin userAdmin) {
		try {
			sessionFactory.getCurrentSession().persist(userAdmin);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(UserAdmin userAdmin) {
		try {
			sessionFactory.getCurrentSession().update(userAdmin);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteUser(UserAdmin userAdmin) {
		userAdmin.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(userAdmin);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
