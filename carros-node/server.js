const express = require('express');
const requireDir = require('require-dir');
const cors = require('cors');

//iniciando o app
const app = express();

app.use(express.json());

app.use(cors());// libera acesso para todos domínios. 
// preencher com os parâmetros, restringe aos especificados


//rotas
app.use("/api", require("./src/routes"));

app.listen(3001);