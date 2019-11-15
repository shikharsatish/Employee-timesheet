package com.example.Employee.Time.Sheet.controller;

import com.example.Employee.Time.Sheet.modal.Employee;
import com.example.Employee.Time.Sheet.modal.Project;
import com.example.Employee.Time.Sheet.service.EmployeeTimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/emp-time-sheet")
public class EmployeTimeSeetController {

  @Autowired
  EmployeeTimeSheetService employeeTimeSheetService;

  @RequestMapping("/emp")
  public List<Employee> getEmployee(){
    return employeeTimeSheetService.getEmployee();
  }

  @RequestMapping("/emp/{id}")
  public Employee getEmployeeById(@PathVariable int id){
    return employeeTimeSheetService.getEmployeeById(id);
  }

  @RequestMapping(value = "/emp", method = RequestMethod.POST)
  public void insertEmployee(@RequestBody Employee employee){
    employeeTimeSheetService.insertEmployee(employee);
  }

  @RequestMapping("/project")
  public List<Project> getProject(){
    return employeeTimeSheetService.getProject();
  }

  @RequestMapping("/project/{id}")
  public Iterable<Project> getProjectById(@PathVariable int id){
    return  employeeTimeSheetService.getProjectData(id);
  }

  @RequestMapping(value = "/project", method = RequestMethod.POST)
  public void insertProject(@RequestBody Project project){
    employeeTimeSheetService.addProject(project);
  }

  @RequestMapping("/project-report")
  public int getProjectReport(){
    return employeeTimeSheetService.projectReport();
  }
}

//@RequestMapping(value = "/hours",method = RequestMethod.POST)
//public void addHours(@RequestBody int hours){
//  employeeTimeSheetService.addHours(hours);

