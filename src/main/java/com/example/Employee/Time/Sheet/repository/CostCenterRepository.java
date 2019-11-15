package com.example.Employee.Time.Sheet.repository;

import com.example.Employee.Time.Sheet.modal.CostCenter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CostCenterRepository {

  @PersistenceContext
  private EntityManager entityManager;

  public String getBudgetType(){
    return new CostCenter().getBudgetType();
  }

  public Integer getTotalCost(){
    return new CostCenter().getTotalCost();
  }
}
