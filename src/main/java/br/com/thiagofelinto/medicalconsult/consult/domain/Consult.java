package br.com.thiagofelinto.medicalconsult.consult.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "CONSULTS")
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONSULT")
    private long idConsult;

    @Column(name = "CONSULT_DATE")
    private Date consultDate;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "PATIENT_NAME")
    private String patientName;

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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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
