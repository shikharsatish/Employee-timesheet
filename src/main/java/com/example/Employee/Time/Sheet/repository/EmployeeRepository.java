package com.example.Employee.Time.Sheet.repository;

import com.example.Employee.Time.Sheet.modal.Employee;
import com.example.Employee.Time.Sheet.modal.Timesheet;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {

  @PersistenceContext
  private EntityManager entityManager;

  public List<Employee> getEmployee() {
    List<Employee> list = entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    return list;
  }

  public Employee getDataById(int id) {
    Employee emp = entityManager.find(Employee.class, id);
    return emp;
  }

  public void saveEmployee(Employee employee) {
    entityManager.persist(employee);
  }

}
