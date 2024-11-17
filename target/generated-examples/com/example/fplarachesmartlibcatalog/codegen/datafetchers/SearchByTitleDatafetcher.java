package com.example.fplarachesmartlibcatalog.codegen.datafetchers;

import com.example.fplarachesmartlibcatalog.codegen.types.Livre;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import jakarta.annotation.Generated;
import java.util.List;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-11-16T13:37:57.131608428Z"
)
@com.example.fplarachesmartlibcatalog.codegen.Generated
@DgsComponent
public class SearchByTitleDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "searchByTitle"
  )
  public List<Livre> getSearchByTitle(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
