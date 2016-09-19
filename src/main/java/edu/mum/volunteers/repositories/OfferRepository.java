package edu.mum.volunteers.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.mum.volunteers.models.Offer;

public interface OfferRepository extends CrudRepository<Offer, Integer>{
}
