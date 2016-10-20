package eti.krebscode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eti.krebscode.model.User;
import eti.krebscode.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value={"/",""}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public void start() {
		
	}
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User user(User user) {
		
		// apenas para teste
		User getUser = userRepository.findOne(1); 
		
		return getUser;
		
	}
	
}
