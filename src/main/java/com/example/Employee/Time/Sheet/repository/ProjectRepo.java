package com.example.Employee.Time.Sheet.repository;

import com.example.Employee.Time.Sheet.modal.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Integer> {
  Iterable<Project> findAllById(Integer id);
}
