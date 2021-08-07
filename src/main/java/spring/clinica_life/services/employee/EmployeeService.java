package spring.clinica_life.services.employee;

import spring.clinica_life.models.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee save(Employee employee);

}
