package archy.wiz.nrathtradingsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import archy.wiz.nrathtradingsbackend.dao.ProjectDAO;
import archy.wiz.nrathtradingsbackend.dto.Projects;

public class ProjectTestCase {
	
	
	private static AnnotationConfigApplicationContext context;
	private static ProjectDAO projectDAO;
	private Projects project;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("archy.wiz.nrathtradingsbackend");
		context.refresh();
		projectDAO = (ProjectDAO)context.getBean("projectDAO");
	}
	
	@Test
	public void TestProjects() {
	
		project = new Projects();
		project.setClientName("Makhado Local Municipality");
		project.setProjectDescription("Rehabilitation of Pretorius Street");
		project.setProjectValue("R 5 265 005.90 ");
		project.setStartDate("24 October 2022 ");
		project.setCompletionDate("30 June 2023");
		project.setRefContacts("Mrs Thulare L  015 519 3000");
		project.setImage("imageProject1.jpg");
		project.setUserAdminId(1);
		project.setCategoryId(1);
		assertEquals("you have successfully added a project",true,projectDAO.addProject(project));
		
		project = new Projects();
		project.setClientName("Makhado Local Municipality");
		project.setProjectDescription("Rehabilitation of Street in Waterval: Djunani street");
		project.setProjectValue("R 7 456 323.03");
		project.setStartDate("09 June 2022");
		project.setCompletionDate("15 December 2022");
		project.setRefContacts("Mrs Thulare L  015 519 3000");
		project.setImage("imageProject2.jpg");
		project.setUserAdminId(1);
		project.setCategoryId(1);
		assertEquals("you have successfully added a project",true,projectDAO.addProject(project));
		
		project = new Projects();
		project.setClientName("Makhado Local Municiplality");
		project.setProjectDescription("Refurbishment of all Taxi rank Toilets in Makhado Town");
		project.setProjectValue("R 1 547 961.19");
		project.setStartDate("19 February 2021");
		project.setCompletionDate("03 August 2021");
		project.setRefContacts("Mrs Thulare L  015 519 3000");
		project.setImage("imageProject3.jpg");
		project.setUserAdminId(1);
		project.setCategoryId(2);
		assertEquals("you have successfully added a project",true,projectDAO.addProject(project));
	
	
	
	    project = projectDAO.getProject(2);
		assertEquals("you have successfully fetched a project","Rehabilitation of Street in Waterval: Djunani street",project.getProjectDescription());
		
		project.setClientName("Makhado Local Municipality");
		project.setProjectDescription("Refurbishment of Eltivillas swimming pool");
		project.setProjectValue("R 526 799.95");
		project.setStartDate("12 October 2021 ");
		project.setCompletionDate("29 November 2021");
		project.setRefContacts("Mrs Thulare L  015 519 3000");
		project.setImage("imageProject4.jpg");
		project.setUserAdminId(1);
		project.setCategoryId(1);
		assertEquals("you have successfully updated a project",true,projectDAO.updateProject(project));
		
		assertEquals("you have successfully deleted project",true,projectDAO.deleteProject(project));
		
		assertEquals("you have successfully fetched list of active projects",2,projectDAO.activeProjects().size());
		
		
		assertEquals("you have successfully fetched list of active projects by category",1,projectDAO.GetActiveProjectsByCategory(1).size());
		assertEquals("you have successfully fetched list of active projects by category",1,projectDAO.GetActiveProjectsByCategory(2).size());
		
		assertEquals("you have successfully fetched list of active projects by category",2,projectDAO.getLatestActiveProjects(2).size());
		
		
	}

}







