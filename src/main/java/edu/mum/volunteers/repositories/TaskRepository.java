package edu.mum.volunteers.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.mum.volunteers.models.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{
}
