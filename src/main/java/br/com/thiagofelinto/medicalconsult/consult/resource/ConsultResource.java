package br.com.thiagofelinto.medicalconsult.consult.resource;

import br.com.thiagofelinto.medicalconsult.consult.domain.Consult;
import br.com.thiagofelinto.medicalconsult.consult.services.ConsultServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consult")
public class ConsultResource {

    @Autowired
    private ConsultServices consultServices;

    @GetMapping
    public ResponseEntity<List<Consult>> getAllConsults() {
        List<Consult> consults = consultServices.getAllConsults();
        return ResponseEntity.ok(consults);
    }

    @PostMapping
    public ResponseEntity<Consult> createConsult(@RequestBody Consult consult) {
        Consult newConsult = consultServices.createConsult(consult);
        return ResponseEntity.ok(newConsult);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consult> getConsultById(@PathVariable Long id) {
        Consult consult = consultServices.getConsultById(id);
        return ResponseEntity.ok(consult);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Consult> updateConsult(@PathVariable Long id, @RequestBody Consult consult) {
        Consult updatedConsult = consultServices.updateConsult(id, consult);
        return ResponseEntity.ok(updatedConsult);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConsult(@PathVariable Long id) {
        consultServices.deleteConsult(id);
        return ResponseEntity.noContent().build();
    }
}
