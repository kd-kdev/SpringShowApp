package com.kd.ShowApp;

import com.kd.ShowApp.Entity.Show;
import com.kd.ShowApp.Entity.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class ShowController {
    private final ShowService showService;

    @Autowired
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    // this is such a dumb way of writing it
    @GetMapping
    public List<Show> getShows(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String director,
            @RequestParam(required = false) String country){
//        if(title !=null && director !=null && country !=null) {
//            return showService.getShows();
//        }
        return showService.getShows();
    }

    @GetMapping("/movies")
    public List<Show> getMovies() {
        return showService.getAllMovies();
    }

    @GetMapping("/tvshows")
    public List<Show> getAllTvshows() {
        return showService.getAllTvshows();
    }

//    @PostMapping
//    public ResponseEntity<Show> addShow(@RequestBody Show show) {
//        Show createdShow = showService.addShow(show);
//        return new ResponseEntity<>(createdShow, HttpStatus.CREATED);
//    }

}
