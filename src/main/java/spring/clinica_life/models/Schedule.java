package spring.clinica_life.models;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name="schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Column(length = 50)
    private String nome;

    @NotBlank
    @Column(length = 50)
    private String email;

    @NotBlank
    @Column(length = 30)
    private String telefone;

    @NotNull
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_consulta;

    @NotNull
    @Column
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime hora_consulta;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor schedule;

    @Override
    public String toString() {
        return "Schedule{" +
                "  nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", data_consulta=" + data_consulta +
                ", hora_consulta=" + hora_consulta +
                ", schedule=" + schedule +
                '}';
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getData_consulta() {
        return data_consulta;
    }
    public void setData_consulta(LocalDate data_consulta) {
        this.data_consulta = data_consulta;
    }

    public LocalTime getHora_consulta() {
        return hora_consulta;
    }
    public void setHora_consulta(LocalTime hora_consulta) {
        this.hora_consulta = hora_consulta;
    }

    public Doctor getSchedule() {
        return schedule;
    }
    public void setSchedule(Doctor schedule) {
        this.schedule = schedule;
    }

}

