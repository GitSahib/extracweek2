package edu.mum.volunteers.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Volunteer")
public class Volunteer extends User {
	@OneToMany(mappedBy="user")
	private List<Offer> offers = new ArrayList<Offer>();
}
