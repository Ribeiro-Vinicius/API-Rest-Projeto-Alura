package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EnderecoPaciente(@NotBlank String cidade, @NotBlank @Pattern(regexp = "\\{5-3}") String cep, @NotBlank String bairro, @NotBlank String uf, String complemento, String numero) {
}
