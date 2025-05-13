package archy.wiz.nrathtradingsbackend.dao;

import java.util.List;

import archy.wiz.nrathtradingsbackend.dto.UserAdmin;

public interface UserAdminDAO {
	
    UserAdmin getUserAdmin(int id);
	
	List<UserAdmin> getUsers();
	
	boolean addUser(UserAdmin userAdmin);
	
	boolean updateUser(UserAdmin userAdmin);
	
	boolean deleteUser(UserAdmin userAdmin);

}
