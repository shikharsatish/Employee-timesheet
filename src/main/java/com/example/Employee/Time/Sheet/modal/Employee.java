package com.example.Employee.Time.Sheet.modal;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String department;

  @ManyToMany(mappedBy = "employees")
  private List<Project> projectList;

  public List<Timesheet> getTimesheetList() {
    return timesheetList;
  }

  public void setTimesheetList(List<Timesheet> timesheetList) {
    this.timesheetList = timesheetList;
  }

  @OneToMany(cascade = CascadeType.ALL  )
  @JoinColumn(name = "employee_id")
  private List<Timesheet> timesheetList;

  public Employee() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

//  public List<Project> getProjects() {
//    return projectList;
//  }

  public void setProjectList(List<Project> projectList) {
    this.projectList = projectList;
  }
}
