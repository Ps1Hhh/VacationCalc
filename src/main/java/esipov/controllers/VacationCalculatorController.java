package esipov.controllers;

import esipov.exception.IncorrectDataVacationException;
import esipov.model.VacationEntity;
import esipov.service.VacationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vacation")
public class VacationCalculatorController {

    private final VacationService service;

    public VacationCalculatorController(VacationService service) {
        this.service = service;
    }

    @GetMapping("/calculate")
    public ResponseEntity<?> getVacation(@RequestBody VacationEntity entity) {
        try {
            return new ResponseEntity<>(service.getVacation(entity), HttpStatus.OK);
        } catch (IncorrectDataVacationException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}