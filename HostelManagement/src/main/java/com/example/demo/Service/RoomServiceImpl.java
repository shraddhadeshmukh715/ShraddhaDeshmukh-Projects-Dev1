package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Room;
import com.example.demo.Repositary.RoomRepositary;

@Service
public class RoomServiceImpl implements RoomService{

	@Autowired 
	RoomRepositary roomRepositary;

	@Override
	public String saveRoom(Room room) {
		// TODO Auto-generated method stub
		roomRepositary.save(room);
		return MessageConstant.ROOM_ADDED_IN_DB;
	}

	@Override
	public Room getRoomById(int id) {
		// TODO Auto-generated method stub
		return roomRepositary.findById(id).get();
	}

	@Override
	public List<Room> getAllRoom() {
		// TODO Auto-generated method stub
		return roomRepositary.findAll();
	}

	@Override
	public void deleteRoomById(int id) {
		// TODO Auto-generated method stub
		roomRepositary.deleteById(id);
	}

	@Override
	public void deleteAllRoom() {
		// TODO Auto-generated method stub
		roomRepositary.deleteAll();
	}
	
	
}
