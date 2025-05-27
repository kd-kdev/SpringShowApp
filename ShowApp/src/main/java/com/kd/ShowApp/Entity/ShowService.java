package com.kd.ShowApp.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShowService {
    private final ShowRepository showRepository;

    @Autowired
    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public List<Show> getShows() {
        return showRepository.findAll();
    }

    public List<Show> getShowsFromCountry(String country) {
        return showRepository.findAll().stream()
                .filter(show -> country.equals(show.getCountry()))
                .collect(Collectors.toList());
    }

    public List<Show> getShowsByName(String searchText) {
        return showRepository.findAll().stream()
                .filter(show -> show.getTitle().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Show> getAllMovies() {
        return showRepository.findAll().stream()
                .filter(show -> show.getType() != null && show.getType().trim().equalsIgnoreCase("movie"))
                .collect(Collectors.toList());
    }

    public List<Show> getAllTvshows() {
        return showRepository.findAll().stream()
                .filter(show -> show.getType() != null && show.getType().trim().equalsIgnoreCase("tv show"))
                .collect(Collectors.toList());
    }

//    public Show addShow(Show show) {
//
//    }

//    public List<Show> getShowByRating (String rating) {
//        return;
//    }
}
