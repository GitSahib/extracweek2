package edu.mum.volunteers.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.mum.volunteers.models.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer>{
}
