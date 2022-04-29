package com.BikkadIT.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.model.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Serializable>{
	
	public List<Admin> findByUsernameAndPassword(String username,String password);

}
