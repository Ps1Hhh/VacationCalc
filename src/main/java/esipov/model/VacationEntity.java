package esipov.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VacationEntity {

    Integer vacationDays;
    Double salary;

    public VacationEntity(Integer vacationDays, Double salary) {
        this.vacationDays = vacationDays;
        this.salary = salary;
    }

}
