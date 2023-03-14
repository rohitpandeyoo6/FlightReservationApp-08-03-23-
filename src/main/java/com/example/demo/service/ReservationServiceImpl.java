package com.example.demo.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ReservationRequest;
import com.example.demo.entity.Flight;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Reservation;
import com.example.demo.repository.FlightRepository;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.utilities.PDFgenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private PassengerRepository passengerRepository;
	
	@Autowired
	private FlightRepository flightRepo;
	
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	private PDFgenerator PDFgenerator;
	
	
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		String firstName = request.getFirstName();
		String lastName = request.getLastName();
		String middleName = request.getMiddleName();
		String email = request.getEmail();
		String phone = request.getPhone();
		
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(firstName);
		passenger.setLastName(lastName);
		passenger.setMiddleName(middleName);
		passenger.setEmail(email);
		passenger.setPhone(phone);
		passengerRepository.save(passenger);
		
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		
		String filePath ="C:\\Users\\rohit\\eclipse-workspace\\demo\\demo\\tickets\\reservation"+reservation.getId()+".pdf";
		
		reservationRepo.save(reservation);
		
		PDFgenerator.generateItinerary(reservation, filePath);
		
		return reservation;
	}

}
