package esipov.controllers;

import esipov.model.VacationEntity;
import esipov.service.VacationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class VacationCalculatorController {

    private final VacationService service;

    @PostMapping("/calculate")
    public ResponseEntity<Double> getVacation(@RequestBody VacationEntity entity) {
        return new ResponseEntity<>(service.getVacation(entity), HttpStatus.OK);
    }
}