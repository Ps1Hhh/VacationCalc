package esipov.model;

public class VacationEntity {

    Integer vacationDays;
    Double salary;

    public VacationEntity(Integer vacationDays, Double salary) {
        this.vacationDays = vacationDays;
        this.salary = salary;
    }

    public Integer getVacationDays() {
        return this.vacationDays;
    }

    public Double getSalary() {
        return this.salary;
    }
}
