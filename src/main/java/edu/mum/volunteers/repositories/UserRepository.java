package edu.mum.volunteers.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.mum.volunteers.models.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	 @Query("select u from User u where u.userType = ?1")
	 User findByUserType(String emailAddress);
}
