package com.example.Hotel.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hotel.domain.RoomReservation;
import com.example.Hotel.repository.RoomReservationRepository;

import java.util.List;

@Service
public class RoomReservationService {
	
    @Autowired private RoomReservationRepository repo;

    public List<RoomReservation> listAll(){
        return (List<RoomReservation>) repo.findAll();
    }

    public void save(RoomReservation room) {
        repo.save(room);
    }

 
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
