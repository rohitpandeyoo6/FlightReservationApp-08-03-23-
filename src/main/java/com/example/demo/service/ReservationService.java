package com.example.demo.service;

import com.example.demo.dto.ReservationRequest;
import com.example.demo.entity.Reservation;

public interface ReservationService {
	Reservation bookFlight(ReservationRequest request);
}
