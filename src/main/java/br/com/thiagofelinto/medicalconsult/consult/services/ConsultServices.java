package br.com.thiagofelinto.medicalconsult.consult.services;

import br.com.thiagofelinto.medicalconsult.consult.domain.Consult;
import br.com.thiagofelinto.medicalconsult.consult.repositories.ConsultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultServices {

    @Autowired
    private ConsultRepository consultRepository;

    public List<Consult> getAllConsults() {
        return consultRepository.findAll();
    }

    public Consult createConsult(Consult consult) {
        return consultRepository.save(consult);
    }

    public Consult getConsultById(Long id) {
        Optional<Consult> consult = consultRepository.findById(id);
        return consult.orElse(null);
    }

    public Consult updateConsult(Long id, Consult consultDetails) {
        Consult consult = getConsultById(id);
        if (consult != null) {
            consult.setConsultDate(consultDetails.getConsultDate());
            consult.setDoctorName(consultDetails.getDoctorName());
            consult.setPatientName(consultDetails.getPatientName());
            consult.setSymptoms(consultDetails.getSymptoms());
            consult.setDiagnosis(consultDetails.getDiagnosis());
            return consultRepository.save(consult);
        }
        return null;
    }

    public void deleteConsult(Long id) {
        consultRepository.deleteById(id);
    }
}
