package com.lti.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.lti.entity.Passenger;
import com.lti.repository.PassengerRepository;

@Service
public class PassengerDetailsService {
@Autowired
PassengerRepository passengerRepository;
public List<Passenger>getAllPassengers()
{
	List<Passenger>passenger=new ArrayList<Passenger>();
for(Passenger passenger1:passenger)
	return passenger;
return passenger;

}
public Passenger getPassengersById(int id) {
	return passengerRepository.findById(id).get();
	
}
public void saveOrUpdate(Passenger passenger) {
	
	// TODO Auto-generated method stub
	passengerRepository.save(passenger);
}

}
