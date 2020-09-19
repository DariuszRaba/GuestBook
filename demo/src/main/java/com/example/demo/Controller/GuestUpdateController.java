package com.example.demo.Controller;

import com.example.demo.Guest.Guest;
import com.example.demo.Service.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "update/{id}")
public class GuestUpdateController {

    private GuestService service;

    public GuestUpdateController(GuestService service) {
        this.service = service;
    }


    @GetMapping
    public String getGuest(Model model, @PathVariable int id) {
        model.addAttribute("TheGuest", service.getGuest((id)));
        model.addAttribute("TheGuestId", id);
        return "update";
    }

    @PostMapping
    public String updateGuest(@PathVariable int id, @ModelAttribute(value = "TheGuest") Guest TheGuest) {
        service.updateGuest(id, TheGuest);
        return "redirect:/home";
    }

}

