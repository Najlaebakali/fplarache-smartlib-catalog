package com.example.fplarachesmartlibcatalog.Resolver;

import com.example.fplarachesmartlibcatalog.Entity.Livre;
import com.example.fplarachesmartlibcatalog.Service.LivreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
@Tag(name = "Livre Resolver", description = "Endpoints pour gérer les livres")
public class LivreResolver {

    @Autowired
    private LivreService livreService;


    // Queries
    @Operation(summary = "Obtenir tous les livres", description = "Récupère la liste complète des livres.")
    @QueryMapping
    public List<Livre> getAllLivres() {
        return livreService.getAll();
    }

    @Operation(summary = "Obtenir un livre par ID", description = "Récupère un livre spécifique en utilisant son ID.")
    @QueryMapping
    public Livre getLivreById(@Argument Long id) {
        return livreService.getByid(id);
    }

    @Operation(summary = "Rechercher par titre", description = "Recherche des livres correspondant au titre fourni.")
    @QueryMapping
    public List<Livre> searchByTitle(@Argument String title) {
        return livreService.searchByTitle(title);
    }

    @Operation(summary = "Filtrer par genre et auteur", description = "Filtre les livres par genre et auteur.")
    @QueryMapping
    public List<Livre> filterByGenreAndAuthor(@Argument String genre, @Argument String author) {
        return livreService.filterByGenreAndAuthor(genre, author);
    }


    @Operation(summary = "Obtenir les livres par statut", description = "Récupère les livres en fonction de leur statut (par exemple: disponible, emprunté).")
    @QueryMapping
    public List<Livre> getLivresByStatus(@Argument String status) {
        return livreService.getLivresByStatus(status);
    }

    @Operation(summary = "Ajouter un nouveau livre", description = "Crée un nouveau livre avec les informations fournies.")
    // Mutations
    @MutationMapping
    public Livre saveLivre(
            @Argument String titre,
            @Argument String auteur,
            @Argument String genre,
            @Argument String description,
            @Argument String datePublication,
            @Argument String isbn,
            @Argument String status
    ) {
        return livreService.saveLivre(titre, auteur, genre, description, datePublication, isbn, status);
    }

    @Operation(summary = "Mettre à jour un livre", description = "Met à jour les informations d'un livre existant.")
    @MutationMapping
    public Livre updateLivre(@Argument Long id, @Argument String titre,
                             @Argument String auteur, @Argument String genre,
                             @Argument String description, @Argument String datePublication,
                             @Argument String isbn, @Argument String status) {
        return livreService.updateLivre(id, titre, auteur, genre, description, datePublication, isbn, status);
    }

    @Operation(summary = "Supprimer un livre", description = "Supprime un livre en utilisant son ID.")
    @MutationMapping
    public String deleteLivre(@Argument Long id) {
        livreService.delete(id);
        return "Livre supprimé avec succès!";
    }
}
