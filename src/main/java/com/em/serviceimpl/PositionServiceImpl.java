package com.em.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.em.entity.Position;
import com.em.repo.PositionRepository;
import com.em.services.PositionService;
@Service
public class PositionServiceImpl  implements PositionService{

	@Autowired 
	private  PositionRepository positionRepository ;
	@Override
	public Position savePosition(Position position) {
		
		return this.positionRepository.save(position);
	}

	@Override
	public Position getPositionById(Long id) {
		
		return this.positionRepository.findById(id).get();
	}

	@Override
	public List<Position> getAllPositions() {
		
		return this.positionRepository.findAll();
		}

	@Override
	public void deletePosition(Long id) {
		
	  this.positionRepository.deleteById(id);
		
	}

}
