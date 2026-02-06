package com.rajesh.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee_details")
public class Employee {

    @Id
    @Column(name="SID")
    private Integer sid;

    @Column(name = "SNAME")
    private String sName;

    @Column(name = "SCITY")
    private String sCity;

     public Employee()
     {
         System.out.println("Zero Param Constructor For Hibernate");
     }
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sCity='" + sCity + '\'' +
                '}';
    }

}
