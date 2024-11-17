package com.example.fplarachesmartlibcatalog.codegen.types;

import jakarta.annotation.Generated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-11-16T13:37:57.131608428Z"
)
@com.example.fplarachesmartlibcatalog.codegen.Generated
public class Livre {
  private String id;

  private String titre;

  private String auteur;

  private String genre;

  private String description;

  private String datePublication;

  private String isbn;

  private String status;

  public Livre() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public String getAuteur() {
    return auteur;
  }

  public void setAuteur(String auteur) {
    this.auteur = auteur;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDatePublication() {
    return datePublication;
  }

  public void setDatePublication(String datePublication) {
    this.datePublication = datePublication;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Livre{id='" + id + "', titre='" + titre + "', auteur='" + auteur + "', genre='" + genre + "', description='" + description + "', datePublication='" + datePublication + "', isbn='" + isbn + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Livre that = (Livre) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(titre, that.titre) &&
        Objects.equals(auteur, that.auteur) &&
        Objects.equals(genre, that.genre) &&
        Objects.equals(description, that.description) &&
        Objects.equals(datePublication, that.datePublication) &&
        Objects.equals(isbn, that.isbn) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, titre, auteur, genre, description, datePublication, isbn, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-11-16T13:37:57.131608428Z"
  )
  @com.example.fplarachesmartlibcatalog.codegen.Generated
  public static class Builder {
    private String id;

    private String titre;

    private String auteur;

    private String genre;

    private String description;

    private String datePublication;

    private String isbn;

    private String status;

    public Livre build() {
      Livre result = new Livre();
      result.id = this.id;
      result.titre = this.titre;
      result.auteur = this.auteur;
      result.genre = this.genre;
      result.description = this.description;
      result.datePublication = this.datePublication;
      result.isbn = this.isbn;
      result.status = this.status;
      return result;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder titre(String titre) {
      this.titre = titre;
      return this;
    }

    public Builder auteur(String auteur) {
      this.auteur = auteur;
      return this;
    }

    public Builder genre(String genre) {
      this.genre = genre;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder datePublication(String datePublication) {
      this.datePublication = datePublication;
      return this;
    }

    public Builder isbn(String isbn) {
      this.isbn = isbn;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }
}
