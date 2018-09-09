package com.msvvdv.boroomscore.service.impl;

import com.msvvdv.boroomscore.entity.Room;
import com.msvvdv.boroomscore.repository.RoomRepository;
import com.msvvdv.boroomscore.service.RoomService;
import com.msvvdv.boroomscore.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private SequenceService sequenceService;

    private final static String SEQUENCE_MOVIE_KEY = "movie";

    @Override
    public void save(Room room) {
        room.setId(sequenceService.getNextSequenceId(SEQUENCE_MOVIE_KEY));
        roomRepository.save(room);
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }


}
