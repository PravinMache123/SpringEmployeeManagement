package com.em.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.em.entity.Position;
@Service
public interface PositionService {
	    Position savePosition(Position position);
	    Position getPositionById(Long id);
	    List<Position> getAllPositions();
	    void deletePosition(Long id);
	    // Other methods as needed
	}



