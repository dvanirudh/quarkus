package org.quarkus.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.quarkus.entity.Employee;

@ApplicationScoped
public class EmpRepository implements PanacheRepository<Employee> { }

