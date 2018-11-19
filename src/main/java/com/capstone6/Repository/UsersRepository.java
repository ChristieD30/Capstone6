package com.capstone6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.capstone6.Entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	
	Users findByEmail(String email);
	

	

}
