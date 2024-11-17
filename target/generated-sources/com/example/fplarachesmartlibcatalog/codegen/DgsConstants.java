package com.example.fplarachesmartlibcatalog.codegen;

import java.lang.String;

@jakarta.annotation.Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-11-16T13:37:57.131608428Z"
)
@Generated
public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static final String MUTATION_TYPE = "Mutation";

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-11-16T13:37:57.131608428Z"
  )
  @Generated
  public static class LIVRE {
    public static final String TYPE_NAME = "Livre";

    public static final String Id = "id";

    public static final String Titre = "titre";

    public static final String Auteur = "auteur";

    public static final String Genre = "genre";

    public static final String Description = "description";

    public static final String DatePublication = "datePublication";

    public static final String Isbn = "isbn";

    public static final String Status = "status";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-11-16T13:37:57.131608428Z"
  )
  @Generated
  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String GetAllLivres = "getAllLivres";

    public static final String GetLivreById = "getLivreById";

    public static final String SearchByTitle = "searchByTitle";

    public static final String FilterByGenreAndAuthor = "filterByGenreAndAuthor";

    public static final String GetLivresByStatus = "getLivresByStatus";

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-11-16T13:37:57.131608428Z"
    )
    @Generated
    public static class GETLIVREBYID_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-11-16T13:37:57.131608428Z"
    )
    @Generated
    public static class SEARCHBYTITLE_INPUT_ARGUMENT {
      public static final String Title = "title";
    }

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-11-16T13:37:57.131608428Z"
    )
    @Generated
    public static class FILTERBYGENREANDAUTHOR_INPUT_ARGUMENT {
      public static final String Genre = "genre";

      public static final String Author = "author";
    }

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-11-16T13:37:57.131608428Z"
    )
    @Generated
    public static class GETLIVRESBYSTATUS_INPUT_ARGUMENT {
      public static final String Status = "status";
    }
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2024-11-16T13:37:57.131608428Z"
  )
  @Generated
  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String SaveLivre = "saveLivre";

    public static final String UpdateLivre = "updateLivre";

    public static final String DeleteLivre = "deleteLivre";

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-11-16T13:37:57.131608428Z"
    )
    @Generated
    public static class SAVELIVRE_INPUT_ARGUMENT {
      public static final String Titre = "titre";

      public static final String Auteur = "auteur";

      public static final String Genre = "genre";

      public static final String Description = "description";

      public static final String DatePublication = "datePublication";

      public static final String Isbn = "isbn";

      public static final String Status = "status";
    }

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-11-16T13:37:57.131608428Z"
    )
    @Generated
    public static class UPDATELIVRE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Titre = "titre";

      public static final String Auteur = "auteur";

      public static final String Genre = "genre";

      public static final String Description = "description";

      public static final String DatePublication = "datePublication";

      public static final String Isbn = "isbn";

      public static final String Status = "status";
    }

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2024-11-16T13:37:57.131608428Z"
    )
    @Generated
    public static class DELETELIVRE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }
}
