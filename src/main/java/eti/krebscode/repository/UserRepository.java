package eti.krebscode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eti.krebscode.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	
}
