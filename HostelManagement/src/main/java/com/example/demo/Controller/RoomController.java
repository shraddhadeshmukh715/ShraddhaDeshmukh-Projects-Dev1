package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Room;
import com.example.demo.Service.RoomService;

@RestController
@RequestMapping("room")
public class RoomController {

	@Autowired 
	RoomService roomService;
	
	@PostMapping("/add")
	String addRoom(Room room)
	{
		 roomService.saveRoom(room);
		 return MessageConstant.ROOM_ADDED_IN_DB;
	}
	
	@GetMapping("/get/{id}")
	Room getById(@RequestBody int id)
	{
		return roomService.getRoomById(id);
	}
	
	@GetMapping("/get")
	List<Room> getAll()
	{
		return roomService.getAllRoom();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		roomService.deleteRoomById(id);
		return MessageConstant.ROOM_DELETED_FROM_DB;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		roomService.deleteAllRoom();
		return MessageConstant.ALL_ROOMS_DELETED_FROM_DB;
	}
}
