package exemplo.ms3.imoveis.controller;

import exemplo.ms3.imoveis.domain.Imovel;
import exemplo.ms3.imoveis.repository.ImovelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("imovel")
@Slf4j
public class ImovelController {

    @Autowired
    ImovelRepository imovelRepository;

    @GetMapping
    public List<Imovel> lista(){
        log.info("ENDPOINTIMOVEL");
        return imovelRepository.findAll();
    }

}
