package med.voll.api.paciente;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;
import med.voll.api.endereco.EnderecoPaciente;

@Entity(name = "Paciente")
@Table(name = "pacientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "cpf")
public class Paciente {
    @Id
    String cpf;
    String nome;
    String email;
    String telefone;
    @Embedded
    Endereco endereco;

    public Paciente(DadosDoPaciente dadosDoPaciente) {
        this.nome = dadosDoPaciente.nome();
        this.cpf = dadosDoPaciente.cpf();
        this.email = dadosDoPaciente.email();
        this.telefone = dadosDoPaciente.telefone();
        this.endereco = new Endereco(dadosDoPaciente.endereco());
    }
}
