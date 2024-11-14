package com.dslist.demodslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dslist.demodslist.repositories.GameRepository;
import com.dslist.demodslist.dto.GameMinDTO;
import com.dslist.demodslist.entities.Game;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)) .toList();
        return dto;
    }
}
