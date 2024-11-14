package com.dslist.demodslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dslist.demodslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
