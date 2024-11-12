package org.quarkus.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.quarkus.entity.Employee;
import org.quarkus.repository.EmpRepository;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

@ApplicationScoped
public class EmpService {

    @Inject
    EmpRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.listAll();
    }

    public Employee getEmployeeById(Long empId) {
        return repository.findById(empId);
    }


}


