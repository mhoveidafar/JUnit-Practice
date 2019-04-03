package com.mhoveidafar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mhoveidafar.entity.PlayerMapping;



@Repository

public interface IPlayerMappingDAO extends CrudRepository<PlayerMapping, Integer> {

}
