package com.mhoveidafar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhoveidafar.entity.PlayerMapping;

@Service
public interface IPlayerMappingService {
	
	List<PlayerMapping> findAllPlayerMapping();

}
