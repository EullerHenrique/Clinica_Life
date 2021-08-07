package spring.clinica_life.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="people")
/*  @Inheritance(strategy = InheritanceType.JOINED)
                        |
                        v
    Identifica que a estratégia de herança será “JOINED”,
    ou seja, será feita uma junção através de chaves estrangeiras.
 */

@Inheritance(strategy = InheritanceType.JOINED)
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_people;

    @NotBlank
    @Column(length = 50)
    private String nome;

    /* Adicionar chave composta */
    @NotBlank
    @Column(length = 50)
    private String email;

    @NotBlank
    @Column(length = 30)
    private String telefone;

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

    public Long getId_people() {
        return id_people;
    }

    public void setId_people(Long id_people) {
        this.id_people = id_people;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

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
