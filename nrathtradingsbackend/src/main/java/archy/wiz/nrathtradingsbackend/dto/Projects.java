package archy.wiz.nrathtradingsbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Projects {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String clientName;
	private String projectDescription;
	private String projectValue;
	private String startDate;
	private String completionDate;
	private String refContacts;
	private String image;
	private int userAdminId;
	@Column(name = "is_active")
	private boolean active = true;
	private Integer categoryId;
	
	

	@Override
	public String toString() {
		return "Projects [id=" + id + ", clientName=" + clientName + ", projectDescription=" + projectDescription
				+ ", projectValue=" + projectValue + ", startDate=" + startDate + ", completionDate=" + completionDate
				+ ", refContacts=" + refContacts + ", image=" + image + ", userAdminId=" + userAdminId + ", active="
				+ active + ", categoryId=" + categoryId + "]";
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getProjectValue() {
		return projectValue;
	}
	public void setProjectValue(String projectValue) {
		this.projectValue = projectValue;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public String getRefContacts() {
		return refContacts;
	}
	public void setRefContacts(String refContacts) {
		this.refContacts = refContacts;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getUserAdminId() {
		return userAdminId;
	}
	public void setUserAdminId(int userAdminId) {
		this.userAdminId = userAdminId;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}


}
