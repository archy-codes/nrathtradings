package archy.wiz.nrathtradingsbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String CategoryName;
	@Column( name = "is_active")
	private boolean active = true;
	private int userAdminId;
	
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", CategoryName=" + CategoryName + ", active=" + active + ", userAdminId="
				+ userAdminId + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getUserAdminId() {
		return userAdminId;
	}
	public void setUserAdminId(int userAdminId) {
		this.userAdminId = userAdminId;
	}
	
	
	
	
	
	
	
}
