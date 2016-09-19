package edu.mum.volunteers.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.mum.volunteers.models.Image;

public interface ImageRepository extends CrudRepository<Image, Integer>{
}
