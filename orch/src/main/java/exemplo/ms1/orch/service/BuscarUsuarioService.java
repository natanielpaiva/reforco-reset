package exemplo.ms1.orch.service;

import exemplo.ms1.orch.repository.CarroRepository;
import exemplo.ms1.orch.repository.ImovelRepository;
import exemplo.ms1.orch.repository.UsuarioRepository;
import exemplo.ms1.orch.repository.response.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuscarUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ImovelRepository imovelRepository;

    @Autowired
    private CarroRepository carroRepository;

    public List<UsuarioResponse> apply() {

        var imoveis = imovelRepository.retornaImovel();

        var usuarios = usuarioRepository.retornaUsuarios();

        var carros = carroRepository.retornaCarros();

        usuarios.forEach(usuarioResponse -> {
            usuarioResponse.setImoveis(imoveis.stream()
                    .filter(imovelResponse -> imovelResponse.getUsuarioId().equals(usuarioResponse.getId()))
                    .collect(Collectors.toList()));
        });

        usuarios.forEach(usuarioResponse -> {
            usuarioResponse.setCarros(carros.stream()
                    .filter(carroResponse -> carroResponse.getUsuarioId().equals(usuarioResponse.getId()))
                    .collect(Collectors.toList()));
        });

        return usuarios;
    }

}
