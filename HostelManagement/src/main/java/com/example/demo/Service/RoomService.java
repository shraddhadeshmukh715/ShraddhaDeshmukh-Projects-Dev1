package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Room;

public interface RoomService {

	String saveRoom(Room room);
	
	Room getRoomById(int id);
	
	List<Room> getAllRoom();
	
	void deleteRoomById(int id);
	
	void deleteAllRoom();
}
