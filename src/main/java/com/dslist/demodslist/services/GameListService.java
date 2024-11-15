package com.dslist.demodslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dslist.demodslist.repositories.GameListRepository;
import com.dslist.demodslist.dto.GameListDTO;
import com.dslist.demodslist.entities.GameList;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> gamelist = result.stream().map(x -> new GameListDTO(x)) .toList();
        return gamelist;
    }
}
