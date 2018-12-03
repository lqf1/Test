package cn.com.taijiTest;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false,length=20)
	private String tname;
	@Column(nullable=false,length=20)
	private String cname;
	@ManyToMany
	@JoinTable(name="student",joinColumns=@JoinColumn(name="teacher_id"),
	inverseJoinColumns=@JoinColumn(name="student_id"))
	private List<Student> studentList;
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tname=" + tname + ", cname=" + cname + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
