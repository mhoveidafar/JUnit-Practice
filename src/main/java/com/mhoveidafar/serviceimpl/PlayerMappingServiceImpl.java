package com.mhoveidafar.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhoveidafar.entity.PlayerMapping;
import com.mhoveidafar.repository.IPlayerMappingDAO;
import com.mhoveidafar.service.IPlayerMappingService;

@Service
public class PlayerMappingServiceImpl implements IPlayerMappingService {
	
	@Autowired
	IPlayerMappingDAO playerMappingDAO;

	@Override
	public List<PlayerMapping> findAllPlayerMapping() {
		
		return (List<PlayerMapping>) playerMappingDAO.findAll();
	}

}
