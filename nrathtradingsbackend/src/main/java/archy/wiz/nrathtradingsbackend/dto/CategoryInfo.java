package archy.wiz.nrathtradingsbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoryInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeaderOne() {
		return headerOne;
	}
	public void setHeaderOne(String headerOne) {
		this.headerOne = headerOne;
	}
	public String getFirstDescription() {
		return firstDescription;
	}
	public void setFirstDescription(String firstDescription) {
		this.firstDescription = firstDescription;
	}
	public String getImageUrlOne() {
		return imageUrlOne;
	}
	public void setImageUrlOne(String imageUrlOne) {
		this.imageUrlOne = imageUrlOne;
	}
	public String getHeaderTwo() {
		return headerTwo;
	}
	public void setHeaderTwo(String headerTwo) {
		this.headerTwo = headerTwo;
	}
	public String getSecondDescription() {
		return secondDescription;
	}
	public void setSecondDescription(String secondDescription) {
		this.secondDescription = secondDescription;
	}
	public String getImageURLTwo() {
		return imageURLTwo;
	}
	public void setImageURLTwo(String imageURLTwo) {
		this.imageURLTwo = imageURLTwo;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Column(name = "header1")
	private String headerOne;
	@Column(name="first_description")
	private String firstDescription;
	@Column(name="image_Url1")
	private String imageUrlOne;
	@Column(name="header2")
	private String headerTwo;
	@Column(name="second_description")
	private String secondDescription;
	@Column(name="image_Url2")
	private String imageURLTwo;
	@Column(name="category_id")
    private int categoryId;
    private boolean isActive =  true;
    
    
	@Override
	public String toString() {
		return "CategoryInfo [id=" + id + ", headerOne=" + headerOne + ", firstDescription=" + firstDescription
				+ ", imageUrlOne=" + imageUrlOne + ", headerTwo=" + headerTwo + ", secondDescription="
				+ secondDescription + ", imageURLTwo=" + imageURLTwo + ", categoryId=" + categoryId + ", isActive="
				+ isActive + "]";
	}
    
	
 
}
