package edu.mum.volunteers.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.mum.volunteers.models.Resource;

public interface ResourceRepository extends CrudRepository<Resource, Integer>{
}
