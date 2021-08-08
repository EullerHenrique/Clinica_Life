package spring.clinica_life.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name="doctor")
public class Doctor extends Employee {

    @NotBlank
    @Column(length = 30)
    private String especialidade;

    @NotBlank
    @Column(length = 30)
    private String crm;

    @OneToMany(mappedBy = "doctor")
    private List<Schedule> scheduleList;

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }
    public void setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

}
