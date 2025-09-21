package com.klef.dev.repository;

import com.klef.dev.entity.Room;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> 
{
	List<Room> findByStatus(String status);
	List<Room> findByType(String type);

}
