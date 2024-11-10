package com.example.smartlibcatalog.Repository;

import com.example.smartlibcatalog.Entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre,Long> {
    List<Livre> findByTitreContainingIgnoreCase(String titre); // chercher le livre par titre

    List<Livre> findByGenreOrAuteur(String genre, String auteur); //filtrer soit par auteur ou genre du livre
}
