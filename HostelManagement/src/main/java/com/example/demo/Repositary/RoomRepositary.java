package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Room;

public interface RoomRepositary extends JpaRepository<Room, Integer>{

}
