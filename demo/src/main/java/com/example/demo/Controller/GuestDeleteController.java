package com.example.demo.Controller;

import com.example.demo.Guest.Guest;
import com.example.demo.Service.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/update/{id}/delete")
public class GuestDeleteController {
    private GuestService service;

    public GuestDeleteController(GuestService service) {
        this.service = service;
    }


    @PostMapping
    public String GuestDeletion(@ModelAttribute(value = "TheGuest") Guest theGueste, @PathVariable int id) {
        service.deleteGuest(id);
        return "redirect:/home";
    }
}
