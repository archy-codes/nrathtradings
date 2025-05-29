package archy.wiz.nrathtradingsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import archy.wiz.nrathtradingsbackend.dao.UserAdminDAO;
import archy.wiz.nrathtradingsbackend.dto.UserAdmin;

public class UserAdminTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static UserAdminDAO userAdminDAO;
	private UserAdmin userAdmin;
	
	
	@BeforeClass
	public static void init() {
		 context = new AnnotationConfigApplicationContext();
		 context.scan("archy.wiz.nrathtradingsbackend");
		 context.refresh();
		 userAdminDAO = (UserAdminDAO)context.getBean("userAdminDAO");
	}
	
	@Test
	public void userTestCase() {
		
		userAdmin = new UserAdmin();
		userAdmin.setName("Archy");
		userAdmin.setEmail("archy@gmail.com");
		userAdmin.setPassword("12345");
		assertEquals("you have successfully added a user",true,userAdminDAO.addUser(userAdmin));
		
		userAdmin = new UserAdmin();
		userAdmin.setName("Mbulu");
		userAdmin.setEmail("mbulu@gmail.com");
		userAdmin.setPassword("232356");
		assertEquals("you have successfully added a user",true,userAdminDAO.addUser(userAdmin));
		
		
		userAdmin = userAdminDAO.getUserAdmin(2);
		assertEquals("you have successfully fetched a user by id","Mbulu",userAdmin.getName());
		
		userAdmin.setName("MULAUDZI");
		assertEquals("you have successfully updated a user",true, userAdminDAO.updateUser(userAdmin));
		
		assertEquals("you have successfully updated a user",true, userAdminDAO.deleteUser(userAdmin));
		
		assertEquals("you have successfully updated a user",1, userAdminDAO.getUsers().size());
		
		
		
	}
	

	
	
	

}
