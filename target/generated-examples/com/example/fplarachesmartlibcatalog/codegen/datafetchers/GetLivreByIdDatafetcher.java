package com.example.fplarachesmartlibcatalog.codegen.datafetchers;

import com.example.fplarachesmartlibcatalog.codegen.types.Livre;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import jakarta.annotation.Generated;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-11-16T13:37:57.131608428Z"
)
@com.example.fplarachesmartlibcatalog.codegen.Generated
@DgsComponent
public class GetLivreByIdDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "getLivreById"
  )
  public Livre getGetLivreById(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
