package esipov.controllers;

import esipov.model.VacationEntity;
import esipov.service.VacationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class VacationCalculatorController {

    private final VacationService service;

    public VacationCalculatorController(VacationService service) {
        this.service = service;
    }

    @PostMapping("/calculate")
    public ResponseEntity<?> getVacation(@RequestBody VacationEntity entity) {
        return new ResponseEntity<>(service.getVacation(entity), HttpStatus.OK);
    }
}