package com.example.Employee.Time.Sheet.modal;

import javax.persistence.*;

@Entity
public class CostCenter {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;
  private Integer totalCost;
  private String budgetType;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public CostCenter(){}

  public Integer getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Integer totalCost) {
    this.totalCost = totalCost;
  }

  public String getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(String budgetType) {
    this.budgetType = budgetType;
  }
}
