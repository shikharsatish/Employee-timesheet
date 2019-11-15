package com.example.Employee.Time.Sheet.service;

import com.example.Employee.Time.Sheet.modal.Employee;
import com.example.Employee.Time.Sheet.modal.Project;
import com.example.Employee.Time.Sheet.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeTimeSheetService {

  @Autowired
  CostCenterRepository costCenterRepository;

  @Autowired
  EmployeeRepository employeeRepository;

  @Autowired
  ProjectRepository projectRepository;

  @Autowired
  TimeSheetRepository timeSheetRepository;

  @Autowired
  ProjectRepo projectRepo;

  public List<Employee> getEmployee(){
    return employeeRepository.getEmployee();
  }

  public Employee getEmployeeById(int id){
    Employee emp = employeeRepository.getDataById(id);
    return emp;
  }

  public void insertEmployee(Employee employee){
    employeeRepository.saveEmployee(employee);
  }

  public List<Project> getProject(){
    return projectRepository.getAllProjects();
  }

  public void addProject(Project project){
    projectRepo.save(project);
  }
  public Iterable<Project> getProjectData(Integer id){
    return projectRepo.findAllById(id);
  }

  public Project getProjectbyId(int id){
    return projectRepository.getProjectById(id);
  }

  public void insertProject(Project project){
    projectRepository.insertProject(project);
  }

  public int projectReport(){
return projectRepository.sample();
 }
}
