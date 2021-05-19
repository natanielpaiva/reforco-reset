package exemplo.ms1.orch.repository;

import exemplo.ms1.orch.repository.response.CarroResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "carro", url = "http://localhost:3001/api/carros")
public interface CarroRepository {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    List<CarroResponse> retornaCarros();
}
