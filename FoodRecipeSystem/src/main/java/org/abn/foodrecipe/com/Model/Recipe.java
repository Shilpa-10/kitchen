package org.abn.foodrecipe.com.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Recipe")
@EntityListeners(AuditingEntityListener.class)
public class Recipe {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
@NotBlank
private String name1;
@NotBlank
private String detail;
@NotBlank
private String category;
@NotBlank
private String vegOrNonveg;
@NotBlank
private Date createdAt;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getVegOrNonveg() {
	return vegOrNonveg;
}
public void setVegOrNonveg(String vegOrNonveg) {
	this.vegOrNonveg = vegOrNonveg;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}


}
