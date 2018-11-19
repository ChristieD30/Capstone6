package com.capstone6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone6.Entity.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Integer> {

}
