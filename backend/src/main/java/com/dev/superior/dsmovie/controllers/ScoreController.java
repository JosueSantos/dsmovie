package com.dev.superior.dsmovie.controllers;

import com.dev.superior.dsmovie.dto.MovieDTO;
import com.dev.superior.dsmovie.dto.ScoreDTO;
import com.dev.superior.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;
    
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }
    
}