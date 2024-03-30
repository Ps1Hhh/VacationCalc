package esipov.service;

import esipov.exception.IncorrectDataVacationException;
import esipov.model.VacationEntity;
import org.springframework.stereotype.Service;

@Service
public class VacationService {

    private static final Double AVGDayInMonth = 30.42;

    public String getVacation(VacationEntity entity) {
        if (entity.getSalary() == null || entity.getSalary() <= 0) {
            throw new IncorrectDataVacationException("The salary is missing or it is not correct");
        }
        long countDays;
        if (entity.getVacationDays() == null || entity.getVacationDays() <= 0) {
            throw new IncorrectDataVacationException("The number of vacation days is missing or it is not correct");
        } else {
            countDays = entity.getVacationDays();
        }

        return String.format("%.2f", entity.getSalary() / AVGDayInMonth * countDays);
    }
}
