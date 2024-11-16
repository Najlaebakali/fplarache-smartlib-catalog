const express = require('express');
const swaggerUi = require('swagger-ui-express');
const fs = require('fs');

const app = express();
const port = 3000;

// Lire la spécification OpenAPI
const openApiSpec = JSON.parse(fs.readFileSync('openapi.json', 'utf-8'));

// Servir Swagger UI
app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(openApiSpec));

app.listen(port, () => {
    console.log(`Swagger UI disponible à http://localhost:${port}/api-docs`);
});
