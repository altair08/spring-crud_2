package com.example.Hotel.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Hotel.domain.Login;
import com.example.Hotel.repository.LoginRepository;





@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
  
  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }
  public void save(Login std) {
      repo.save(std);
  }

  

}