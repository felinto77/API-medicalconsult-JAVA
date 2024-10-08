package br.com.thiagofelinto.medicalconsult.consult.domain;

import br.com.thiagofelinto.medicalconsult.user.domain.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name = "CONSULTS")
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONSULT")
    private long idConsult;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CONSULT_DATE")
    private Date consultDate;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "SYMPTOMS")
    private String symptoms;

    @Column(name = "DIAGNOSIS")
    private String diagnosis;


    public long getIdConsult() {
        return idConsult;
    }

    public void setIdConsult(long idConsult) {
        this.idConsult = idConsult;
    }

    public Date getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(Date consultDate) {
        this.consultDate = consultDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
