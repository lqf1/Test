package com.issoft.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@NamedQuery(name="Student.findAll",query="SELECT sname FROM Student sname")
@JsonIgnoreProperties({"handler","hibernatelazyInitializer"})
public class Student implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false,length=20)
	private String sname;
	@Column(nullable = false,length=20)
	private String cname;
//	@ManyToMany(mappedBy="studentList")
//	private List<Teacher> teacherList;
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", cname=" + cname + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	

}
