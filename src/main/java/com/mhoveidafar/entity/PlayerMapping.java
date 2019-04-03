package com.mhoveidafar.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PlayerInfo")
public class PlayerMapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FieldID", unique = true, nullable = false)
	private int id;
	
	@Column(name = "PlayerNumber")
	private Integer playerNumber;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Position")
	private String position;
	
	@Column(name = "Salary")
	private Integer salary;

	public PlayerMapping() {
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