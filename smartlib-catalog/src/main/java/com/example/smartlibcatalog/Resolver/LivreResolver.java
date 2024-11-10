package com.example.smartlibcatalog.Resolver;

import com.example.smartlibcatalog.Entity.Livre;
import com.example.smartlibcatalog.Service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class LivreResolver {

    @Autowired
    private LivreService livreService;

    // Queries
    @QueryMapping
    public List<Livre> getAllLivres() {
        return livreService.getAll();
    }

    @QueryMapping
    public Livre getLivreById(@Argument Long id) {
        return livreService.getByid(id);
    }

    @QueryMapping
    public List<Livre> searchByTitle(@Argument String title) {
        return livreService.searchByTitle(title);
    }

    @QueryMapping
    public List<Livre> filterByGenreAndAuthor(@Argument String genre, @Argument String author) {
        return livreService.filterByGenreAndAuthor(genre, author);
    }

    // Mutations
    @MutationMapping
    public Livre saveLivre(
            @Argument String titre,
            @Argument String auteur,
            @Argument String genre,
            @Argument String description,
            @Argument String datePublication,
            @Argument String isbn
    ) {
        // Convertir datePublication en LocalDateTime
        LocalDateTime date = LocalDateTime.parse(datePublication);

        Livre livre = new Livre();
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setGenre(genre);
        livre.setDescription(description);
        livre.setDatePublication(date);
        livre.setIsbn(isbn);

        // L'ID sera généré automatiquement par la base de données
        return livreService.save(livre);
    }

    @MutationMapping
    public Livre updateLivre(@Argument Long id, @Argument String titre,@Argument String auteur, @Argument String genre, @Argument String description, @Argument String datePublication, @Argument String isbn) {
        Livre livre = new Livre();
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setGenre(genre);
        livre.setDescription(description);
        livre.setDatePublication(LocalDateTime.parse(datePublication));
        livre.setIsbn(isbn);
        return livreService.update(id, livre);
    }

    @MutationMapping
    public String deleteLivre(@Argument Long id) {
        livreService.delete(id);
        return "Livre supprimé avec succès!";
    }
}
