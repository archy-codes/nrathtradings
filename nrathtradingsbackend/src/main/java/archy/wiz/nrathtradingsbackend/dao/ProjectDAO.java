package archy.wiz.nrathtradingsbackend.dao;

import java.util.List;

import archy.wiz.nrathtradingsbackend.dto.Projects;

public interface ProjectDAO {
	
	Projects getProject(int id);
	List<Projects> activeProjects();
	boolean addProject(Projects  project);
	boolean updateProject(Projects project);
	boolean deleteProject (Projects project);
	
	List<Projects> GetActiveProjectsByCategory(int categoryId);
	
	List<Projects> getLatestActiveProjects(int count);
	
	

}
