package com.capstone6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capstone6.Entity.Tasks;
import com.capstone6.Entity.Users;
import com.capstone6.Repository.TasksRepository;
import com.capstone6.Repository.UsersRepository;

@Controller
public class TaskController {
	@Autowired
	UsersRepository user;
	
	@Autowired
	TasksRepository task;
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
	public ModelAndView registerUser() {
		
		return new ModelAndView("register");
	}

	@RequestMapping("signup")
	public ModelAndView signup(Users u1){
	
    
	user.save(u1);
	

		return new ModelAndView("redirect:/added");
	}
	@RequestMapping("/added")
	public ModelAndView signupConf() {
		
		return new ModelAndView("list-task");
	}
	
	@RequestMapping("/signin")
	public ModelAndView signin() {
		
	
	return new ModelAndView("signin");
	}
	@RequestMapping("login")
	
		public ModelAndView verifyInfo(@RequestParam("uemail") String email){
		
		
		
		
		return new ModelAndView("list-task", "tasklist", user.findByEmail(email));
	
	}
	
	
	@RequestMapping("/list-task")
	public ModelAndView tasks() {
		
		return new ModelAndView("list-task");
	}	
	
	@RequestMapping("/add")
	public ModelAndView showForm(@RequestParam("userid") Integer pId){
		
		ModelAndView mv =  new ModelAndView("addtask", "userid", pId);
	
		return mv ;
		
	}
	
	
	
	
	@RequestMapping("/addtask")
	public ModelAndView add(Tasks t1) {
	
	    
		task.save(t1);
		
		return new ModelAndView("reirect:/list-task");
	}
	
}
