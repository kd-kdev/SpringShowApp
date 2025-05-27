package com.kd.ShowApp.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show, String> {
    void deleteByTitle(String title);
    Optional<Show> findByTitle(String title);
}
