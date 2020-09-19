package com.example.demo.Controller;


import com.example.demo.Guest.Guest;
import com.example.demo.Service.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class UserController {
    private GuestService service;

    public UserController(GuestService service) {
        this.service = service;
    }


    @GetMapping
    public String getHome(Model model) {
        model.addAttribute("guest", service.getAllGuests());
        return "homepage";
    }


    @PostMapping
    public String addGuest(@ModelAttribute Guest form, Model model) {
        Guest guest = new Guest(form.getName(),form.getComment());
        service.addGuest(guest);
        model.addAttribute("guest", service.getAllGuests());

        return "homepage";
    }

}