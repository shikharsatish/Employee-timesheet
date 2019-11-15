package com.example.Employee.Time.Sheet.modal;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String projectName;
  private Date startDate;

  @OneToOne(cascade = CascadeType.ALL)
  private CostCenter costCenter;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(joinColumns = @JoinColumn(name = "Project_id"), inverseJoinColumns = @JoinColumn(name = "Employee_id"))
  private List<Employee> employees;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "project_id")
  private List<Timesheet> timesheetList;

  public List<Timesheet> getTimesheetList() {
    return timesheetList;
  }

  public void setTimesheetList(List<Timesheet> timesheetList) {
    this.timesheetList = timesheetList;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  public Project() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public CostCenter getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(CostCenter costCenter) {
    this.costCenter = costCenter;
  }
}
