package com.example.Hotel.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Hotel.domain.RoomReservation;
import com.example.Hotel.service.RoomReservationService;
import java.util.List;

@Controller
public class RoomReservationController {
    @Autowired private RoomReservationService service;

    @GetMapping("/room")
    public String showRoomlist(Model model){
        List<RoomReservation> ListRooms = service.listAll() ;
        model.addAttribute("ListRooms",ListRooms);

        return "newbook";
    }
    

    
   

    @GetMapping("/room/new")
    public String showNewForm(Model model){
        model.addAttribute("RoomReservation",new RoomReservation());
        model.addAttribute("pageTitle","Reserve the Room");
        return "bookroom";
    }

    @PostMapping("/room/save")
    public  String saveUser(RoomReservation room, RedirectAttributes ra){
        service.save(room);
ra.addFlashAttribute("message","The Room has been reserved");
        return "redirect:/room";
    }


    

    @GetMapping("/room/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,RedirectAttributes ra){
     
            service.delete(id);
            ra.addFlashAttribute("message","The Reservation is Deleted");
       
        return "redirect:/room";
    }


}
