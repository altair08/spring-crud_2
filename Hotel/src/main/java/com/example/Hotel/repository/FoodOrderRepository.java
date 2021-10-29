package com.example.Hotel.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hotel.domain.FoodOrder;




@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {

}