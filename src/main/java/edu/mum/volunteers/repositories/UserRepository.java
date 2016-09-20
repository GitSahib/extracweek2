package edu.mum.volunteers.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.mum.volunteers.models.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	 User findTop1ByUserTypeOrderByIdDesc(String userType);
}
