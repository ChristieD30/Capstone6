package com.capstone6.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name ="users")
public class Users {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer userid;
	
	private String name;
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Tasks> tasks = new ArrayList<>();

	public Users(Integer userid,String name, String email, String password, List<Tasks> tasks) {
		super();
		this.name=name;
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.tasks = tasks;
	}

	public Users(Integer userid, String name,String email, String password) {
		super();
		this.userid = userid;
		this.name=name;
		this.email = email;
		this.password = password;
	}
	
	public Users(String name,String email, String password) {
		super();
		this.name=name;
		this.email = email;
		this.password = password;
	}
	public Users(String email, String password) {
		super();

		this.email = email;
		this.password = password;
	}

	public Users() {
		super();
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Tasks> getTasks() {
		return tasks;
	}

	public void setTasks(List<Tasks> tasks) {
		this.tasks = tasks;
	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + " name," + name +  "email=" + email + ", password=" + password + ", tasks=" + tasks + "]";
	}
	
	
	
	
	
	
	
}
