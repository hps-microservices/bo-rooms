package com.msvvdv.boroomscore.repository;

import com.msvvdv.boroomscore.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoomRepository extends MongoRepository<Room,String> {}
