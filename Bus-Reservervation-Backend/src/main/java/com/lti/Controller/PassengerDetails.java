package com.lti.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Passenger;
import com.lti.service.PassengerDetailsService;

@RestController

public class PassengerDetails {

	@Autowired
	PassengerDetailsService passengerDetailsService;
	@GetMapping("/passengerDetails")
	private List<Passenger>getAllPassengers(){
		return passengerDetailsService.getAllPassengers();
	}
	@GetMapping("/passenger/{pass_Id}")
	private Passenger getPassengers(@PathVariable("pass_Id") int pass_Id)
	{
		return passengerDetailsService.getPassengersById(pass_Id);
	}
	@PostMapping("/pass")
	private int saveBook(@RequestBody Passenger passenger) {
		passengerDetailsService.saveOrUpdate(passenger);
		return passenger.getPass_Id();
		
	}
}
