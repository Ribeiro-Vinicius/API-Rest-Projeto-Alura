package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEnderecoMedico;
import med.voll.api.endereco.Endereco;
import org.springframework.lang.NonNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,

        DadosEnderecoMedico endereco) {

}
