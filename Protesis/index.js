const express = require('express');

const app = express();
const port = 3000;

console.log(__dirname + '\\Protesis-Integrado');
// Configuración para servir archivos estáticos
app.use(express.static(__dirname + '\\Protesis-Integrado'));

app.listen(port, () => {
    console.log(`App listening at http://localhost:${port}`);
});