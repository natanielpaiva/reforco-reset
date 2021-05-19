const express = require('express');
const routes = express.Router();

const CarroController = require('./controllers/CarroController');

routes.get('/carros', CarroController.index);

module.exports = routes;