package com.example.demo.DAO;

import com.example.demo.Guest.Guest;

import java.util.List;

public interface UserDao {

    List<Guest> getAllGuest();
    void addGuest(Guest guest);
    Guest getGuest(Integer id);
    void updateGuest(Integer id, Guest guest);
    void deleteGuest(int id);
}
