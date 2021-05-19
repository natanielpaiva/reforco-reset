
module.exports = {
    async index(req, res) {
        let carros = [
            { id: 1, usuarioId: 1, modelo: "Onix" },
            { id: 2, usuarioId: 2, modelo: "Cruze" },
            { id: 3, usuarioId: 1, modelo: "Fusion" },
        ]
        return res.json(carros);
    },

};