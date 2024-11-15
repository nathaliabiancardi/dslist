package com.dslist.demodslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dslist.demodslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
