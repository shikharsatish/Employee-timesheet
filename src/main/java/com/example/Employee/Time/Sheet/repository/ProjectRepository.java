package com.example.Employee.Time.Sheet.repository;

import com.example.Employee.Time.Sheet.modal.Employee;
import com.example.Employee.Time.Sheet.modal.Project;
import com.example.Employee.Time.Sheet.modal.Timesheet;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProjectRepository {

  @PersistenceContext
  private EntityManager entityManager;

  public List<Project> getAllProjects() {
    List<Project> projects = entityManager.createQuery("SELECT e FROM Project e", Project.class).getResultList();
    return projects;
  }

  public Project getProjectById(int id) {
    return entityManager.find(Project.class, id);
  }

  public void insertProject(Project project) {
    entityManager.persist(project);
  }
  public int sample(){
    List<Project> projectList = entityManager.createQuery("SELECT e FROM Project e", Project.class).getResultList();
    Project project = projectList.get(0);
    List<Timesheet> timesheet = project.getTimesheetList();
    Integer sum=timesheet.stream().collect(Collectors.summingInt(Timesheet::getHours));
//    Integer sum = timesheet.stream().filter(s ->s.getHours() < 10).mapToInt(s ->s.getHours()).sum() ;
//    int empCount = project.getEmployees().size();
    int totalCost = sum * 50 ;
    return totalCost;
  }
}
