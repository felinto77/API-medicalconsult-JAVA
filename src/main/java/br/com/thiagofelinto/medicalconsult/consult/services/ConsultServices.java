package br.com.thiagofelinto.medicalconsult.consult.services;

import br.com.thiagofelinto.medicalconsult.consult.domain.Consult;
import br.com.thiagofelinto.medicalconsult.consult.repositories.ConsultRepository;
import br.com.thiagofelinto.medicalconsult.user.domain.User;
import br.com.thiagofelinto.medicalconsult.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultServices {

    @Autowired
    private ConsultRepository consultRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Consult> getAllConsults() {
        return consultRepository.findAll();
    }

    public Consult createConsult(Consult consult) {

        if (consult.getUser() != null) {

            User user = userRepository.findById(consult.getUser().getIdUser()).orElse(null);
            if (user != null) {
                consult.setUser(user);
            } else {
                throw new IllegalArgumentException("Usuário não encontrado");
            }
        }
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
            consult.setUser(consultDetails.getUser());
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
