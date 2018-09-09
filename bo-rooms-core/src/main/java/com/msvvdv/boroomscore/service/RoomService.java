package com.msvvdv.boroomscore.service;

import com.msvvdv.boroomscore.entity.Room;

import java.util.List;

public interface RoomService {
    void save(Room user);
    List<Room> findAll();
}
