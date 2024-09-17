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
    private long idconsult;

    @Column(name = "CONSULT_DATE")
    private Date consultDate;

    @Column(name = "DOCTOR_NAME")
    private String doctorname;

    @Column(name = "PATIENT_NAME")
    private String patientname;

    @Column(name = "SYMPTOMS")
    private String symptoms;

    @Column(name = "DIAGNOSIS")
    private String diagnosis;



    public long getidconsult() {
        return idconsult;
    }

    public void setidconsult(long idConsult) {
        this.idconsult = idConsult;
    }


    public Date getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(Date consultDate) {
        this.consultDate = consultDate;
    }

    public String getDoctorName() {
        return doctorname;
    }

    public void setDoctorName(String doctorName) {
        this.doctorname = doctorName;
    }

    public String getPatientName() {
        return patientname;
    }

    public void setPatientName(String patientName) {
        this.patientname = patientName;
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
