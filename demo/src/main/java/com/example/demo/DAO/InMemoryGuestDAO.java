package com.example.demo.DAO;

import com.example.demo.Guest.Guest;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class InMemoryGuestDAO implements UserDao {

    private final List<Guest> guests = Stream.of(
            new Guest("Daro Maro", "VVV", "08.06.1991"),
            new Guest("Nati Pati", "Ive been here once", "08.06.1991"))
            .collect(Collectors.toList());

    @Override
    public List<Guest> getAllGuest() {
        return guests;
    }

    @Override
    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public Guest getGuest(Integer id) {
        return guests.get(id);
    }

    @Override
    public void updateGuest(Integer index, Guest guest) {
        Guest gueste = new Guest();
    guests.get(index).setName(guest.getName());
    guests.get(index).setComment(guest.getComment());
    guests.get(index).setDate(guest.getDate());
    }

    @Override
    public void deleteGuest(int id) {
    guests.remove(id);
    }

}
