package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.EnderecoPaciente;

public record DadosDoPaciente (@NotBlank String nome, @NotBlank @Email String email, @NotBlank String telefone, @NotBlank @Pattern(regexp = "\\{5-3}") String cpf, @Valid EnderecoPaciente endereco) {


}
