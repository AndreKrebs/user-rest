package eti.krebscode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eti.krebscode.model.UsersModel;

public interface UserRepository extends JpaRepository<UsersModel, Integer> {

	
	
}
