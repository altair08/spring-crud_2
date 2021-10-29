package com.example.Hotel.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hotel.domain.FoodOrder;
import com.example.Hotel.repository.FoodOrderRepository;


@Service
public class FoodOrderService {
	
	@Autowired
    private FoodOrderRepository repo;
	
	public List<FoodOrder> listAll() {
        return repo.findAll();
    }
     
    public void save(FoodOrder std) {
        repo.save(std);
    }
     
    public FoodOrder get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}