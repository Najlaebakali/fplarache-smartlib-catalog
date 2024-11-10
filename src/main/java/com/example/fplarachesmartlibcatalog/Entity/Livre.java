package com.example.fplarachesmartlibcatalog.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Livre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private String titre;
    private String auteur;
    private String genre;
    private String description;

    private LocalDateTime datePublication;
    private String isbn;
    // The status can be "disponible" or "empreint"
    private String status;




}