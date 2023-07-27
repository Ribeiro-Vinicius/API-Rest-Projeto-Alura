package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String bairro;
    private String numero;
    private String cep;
    private String uf;
    private String cidade;

    public Endereco(DadosEnderecoMedico dados) {
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.numero = dados.numero();
    }

    public Endereco(EnderecoPaciente dados) {
        this.bairro = dados.bairro();
        this.numero = dados.numero();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.cep = dados.cep();
    }

    public void atualizarInformacoes(DadosEnderecoMedico dados) {
        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }

        if (dados.cep() != null) {
            this.cep = dados.cep();
        }

        if (dados.cidade() != null) {
            this.cidade = dados.cidade();
        }

        if (dados.uf() != null) {
            this.uf = dados.uf();
        }

        if (dados.numero() != null) {
            this.numero = dados.numero();
        }
    }
}

