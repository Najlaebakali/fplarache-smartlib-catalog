package com.example.fplarachesmartlibcatalog.Resolver;

import com.example.fplarachesmartlibcatalog.Entity.Livre;
import com.example.fplarachesmartlibcatalog.Service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

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
        return livreService.saveLivre(titre, auteur, genre, description, datePublication, isbn);
    }

    @MutationMapping
    public Livre updateLivre(@Argument Long id, @Argument String titre,
                             @Argument String auteur, @Argument String genre,
                             @Argument String description, @Argument String datePublication,
                             @Argument String isbn) {
        return livreService.updateLivre(id, titre, auteur, genre, description, datePublication, isbn);
    }

    @MutationMapping
    public String deleteLivre(@Argument Long id) {
        livreService.delete(id);
        return "Livre supprimé avec succès!";
    }
}
