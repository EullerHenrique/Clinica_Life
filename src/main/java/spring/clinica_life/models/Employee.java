package spring.clinica_life.models;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee extends People {

    @NotNull
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_contrato;

    @NotNull
    @Column(precision=10, scale=2)
    private double salario;

    @NotBlank
    @Column(length = 255)
    private String senha;

    public LocalDate getData_contrato() {
        return data_contrato;
    }

    public void setData_contrato(LocalDate data_contrato) {
        this.data_contrato = data_contrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
