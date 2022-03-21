package com.lti.repository;

import org.springframework.data.repository.CrudRepository;

import com.lti.entity.Passenger;

public interface PassengerRepository  extends CrudRepository<Passenger,Integer> {

	Object findAll = null;

}
