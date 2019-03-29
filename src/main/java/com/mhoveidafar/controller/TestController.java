package com.mhoveidafar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mhoveidafar.entity.Player;

@RestController
public class TestController {

	@RequestMapping(value = "/player", method = RequestMethod.GET)
	public Player bestOne() {

		Player bestPlayer = new Player();
		bestPlayer.setName("Messi");
		bestPlayer.setPosition("striker");
		bestPlayer.setPlayerNumber(10);
		bestPlayer.setSalary(300000000);

		return bestPlayer;
	}

}
