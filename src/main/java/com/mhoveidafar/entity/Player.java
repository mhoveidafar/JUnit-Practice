package com.mhoveidafar.entity;

public class Player {
	private Integer playerNumber;
	private String name;
	private String position;
	private Integer salary;

	public Player() {
	}
	
	public Integer getPlayerNumber() {
		return playerNumber;
	}


	public void setPlayerNumber(Integer playerNumber) {
		this.playerNumber = playerNumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}