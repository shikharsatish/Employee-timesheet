package com.example.Employee.Time.Sheet.modal;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Timesheet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private Date date;
  private int hours;

  public Timesheet(){}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

 public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }
}
