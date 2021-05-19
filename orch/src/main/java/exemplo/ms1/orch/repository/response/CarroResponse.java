package exemplo.ms1.orch.repository.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarroResponse {

    private Long id;

    private Long usuarioId;

    private String modelo;
}
