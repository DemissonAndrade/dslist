package com.devSuperior.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dsList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
