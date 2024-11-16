const { readFileSync, writeFileSync } = require('fs');
const { graphqlToOpenApi } = require('graphql-to-openapi');

// Spécifiez le chemin absolu pour le fichier GraphQL
const schema = readFileSync('schema.graphqls', 'utf-8');

// Convertir le schéma GraphQL en spécification OpenAPI
const openApiSpec = graphqlToOpenApi(schema);

// Sauvegarder la spécification OpenAPI dans un fichier JSON
writeFileSync('openapi.json', JSON.stringify(openApiSpec, null, 2));

