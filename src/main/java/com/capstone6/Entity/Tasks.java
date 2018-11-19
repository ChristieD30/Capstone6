package com.capstone6.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Tasks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskid;
	
	private String taskname;
	private String duedate;
	private String complete;
	
	@ManyToOne
	@JoinColumn (name = "userid")
	private Users user;

	public Tasks(String taskname, String duedate, Integer taskid, String complete, Users user) {
		super();
		this.taskname = taskname;
		this.duedate = duedate;
		this.taskid = taskid;
		this.complete = complete;
		this.user = user;
	}

	public Tasks(String taskname, String duedate, String complete, Users user) {
		super();
		this.taskname = taskname;
		this.duedate = duedate;
		this.complete = complete;
		this.user = user;
	}
	public Tasks(String taskname, String duedate, Users user) {
		super();
		this.taskname = taskname;
		this.duedate = duedate;
		this.user = user;
	}

	public Tasks(String taskname, String duedate) {
		super();
		this.taskname = taskname;
		this.duedate = duedate;
	
	}
	
	
	
	public Tasks() {
		super();
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	

	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}

	public Users  getTask() {
		return user;
	}

	public void setTask(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Tasks [taskname=" + taskname + ", duedate=" + duedate + ", taskid=" + taskid 
				+ ", complete=" + complete + ", user id =" + user + "]";
	}


	
	
	
	
}
