package com.example.fplarachesmartlibcatalog.Repository;

import com.example.fplarachesmartlibcatalog.Entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public interface LivreRepository extends JpaRepository<Livre,Long> {
    List<Livre> findByTitreContainingIgnoreCase(String titre); // chercher le livre par titre

    List<Livre> findByGenreOrAuteur(String genre, String auteur); //filtrer soit par auteur ou genre du livre

    List<Livre> findByStatus(String status);  // Recherche par statut


}
