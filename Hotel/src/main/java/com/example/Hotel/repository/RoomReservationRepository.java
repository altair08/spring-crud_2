package com.example.Hotel.repository;





import org.springframework.data.repository.CrudRepository;
import com.example.Hotel.domain.RoomReservation;

public interface RoomReservationRepository extends CrudRepository<RoomReservation,Long> {
   
}
