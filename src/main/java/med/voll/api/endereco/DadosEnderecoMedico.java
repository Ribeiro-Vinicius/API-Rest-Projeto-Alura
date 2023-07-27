package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEnderecoMedico(@NotBlank String cidade, @NotBlank String uf, @NotBlank String bairro,
                                  @NotBlank @Pattern(regexp = "\\d{8}") String cep, String numero) {
}
