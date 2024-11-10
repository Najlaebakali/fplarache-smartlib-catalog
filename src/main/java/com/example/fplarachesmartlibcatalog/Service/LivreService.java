package com.example.fplarachesmartlibcatalog.Service;

import com.example.fplarachesmartlibcatalog.Entity.Livre;
import com.example.fplarachesmartlibcatalog.Repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LivreService {

    @Autowired
    LivreRepository livreRepository;

    public Livre saveLivre(String titre, String auteur, String genre, String description,
                           String datePublication, String isbn, String status) {
        // Convertir datePublication en LocalDateTime
        LocalDateTime date = LocalDateTime.parse(datePublication);

        Livre livre = new Livre();
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setGenre(genre);
        livre.setDescription(description);
        livre.setDatePublication(date);
        livre.setIsbn(isbn);
        livre.setStatus(status);

        return livreRepository.save(livre);
    }

    public Livre updateLivre(Long id, String titre, String auteur, String genre,
                             String description, String datePublication, String isbn, String status) {
        Livre livre = livreRepository.findById(id).orElseThrow(() -> new RuntimeException("Livre non trouvé"));
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setGenre(genre);
        livre.setDescription(description);
        livre.setDatePublication(LocalDateTime.parse(datePublication));
        livre.setIsbn(isbn);
        livre.setStatus(status);
        return livreRepository.save(livre);
    }

    public Livre getByid(Long id) {
        return livreRepository.getById(id);
    }

    public List<Livre> getAll() {
        return livreRepository.findAll();
    }

    public void delete(Long id) {
        livreRepository.deleteById(id);
    }

    public List<Livre> searchByTitle(String title) {
        return livreRepository.findByTitreContainingIgnoreCase(title);
    }

    public List<Livre> filterByGenreAndAuthor(String genre, String author) {
        return livreRepository.findByGenreOrAuteur(genre, author);
    }

    // Méthode pour récupérer les livres selon leur statut temporairement pour simuler le statut des livres, en attendant la communication avec le service "empreint".
    public List<Livre> getLivresByStatus(String status) {
        return livreRepository.findByStatus(status);
    }

}
