package edu.mum.volunteers.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.mum.volunteers.models.Beneficiary;

public interface BeneficiaryRepository extends CrudRepository<Beneficiary, Integer>{
}
