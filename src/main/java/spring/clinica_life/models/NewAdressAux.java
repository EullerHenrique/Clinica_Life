package spring.clinica_life.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="new_adress_aux")
public class NewAdressAux {

    @Id
    @NotBlank
    @Column(length = 10)
    private String cep;

    @NotBlank
    @Column(length = 50)
    private String logradouro;

    @NotBlank
    @Column(length = 50)
    private String bairro;

    @NotBlank
    @Column(length = 50)
    private String cidade;

    @NotBlank
    @Column(length = 2)
    private String estado;


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
