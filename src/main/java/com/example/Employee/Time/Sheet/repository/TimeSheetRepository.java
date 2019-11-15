package com.example.Employee.Time.Sheet.repository;

import com.example.Employee.Time.Sheet.modal.Timesheet;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TimeSheetRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public Integer getHours(){
        return new Timesheet().getHours();
    }
}
