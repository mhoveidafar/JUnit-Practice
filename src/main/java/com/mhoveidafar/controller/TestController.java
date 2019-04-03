package com.mhoveidafar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mhoveidafar.entity.PlayerMapping;
import com.mhoveidafar.service.IPlayerMappingService;

@RestController
public class TestController {
	
	@Autowired
	private IPlayerMappingService playerMappingService;
	
	@GetMapping("/player")
	public ResponseEntity<List<PlayerMapping>> getPlayerMappingList() {
		List<PlayerMapping> list = playerMappingService.findAllPlayerMapping();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

//	@RequestMapping(value = "/player", method = RequestMethod.GET)
//	public PlayerMapping bestOne() {
//
//		PlayerMapping bestPlayer = new PlayerMapping();
//		bestPlayer.setName("Messi");
//		bestPlayer.setPosition("striker");
//		bestPlayer.setPlayerNumber(10);
//		bestPlayer.setSalary(300000000);
//
//		return bestPlayer;
//	}

}
