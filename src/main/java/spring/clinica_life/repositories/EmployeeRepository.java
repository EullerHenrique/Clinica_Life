package spring.clinica_life.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.clinica_life.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
