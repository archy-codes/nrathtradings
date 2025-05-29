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
	private String image;
	@Column(name="userAdmin_id")
	private int userAdminId;
	
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", CategoryName=" + CategoryName + ", active=" + active + ", image=" + image
				+ ", userAdminId=" + userAdminId + "]";
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
	
	
	
	
	
	
	
	
	
	
}
