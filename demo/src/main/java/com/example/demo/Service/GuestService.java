package com.example.demo.Service;

import com.example.demo.DAO.UserDao;
import com.example.demo.Guest.Guest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    private UserDao dao;

    public GuestService(UserDao dao){
        this.dao = dao;
    }

    public List<Guest> getAllGuests(){
       return dao.getAllGuest();
    }

    public void addGuest(Guest guest){
        dao.addGuest(guest);
    }

    public Guest getGuest(Integer id){
        return dao.getGuest(id);
    }

    public void updateGuest(Integer id, Guest guest){
        dao.updateGuest(id,guest);
    }

    public void deleteGuest(int id){
        dao.deleteGuest(id);
    }
}

