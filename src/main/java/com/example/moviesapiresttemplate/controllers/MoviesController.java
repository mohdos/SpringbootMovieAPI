package com.example.moviesapiresttemplate.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    @RequestMapping("/{movieName}")
    public int searchMovie(@RequestParam(value = "movieName", defaultValue = "") String movieName)
    {
        return 23;
    }

}





