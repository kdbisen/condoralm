package com.allometry.org.model;

import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */

public class Department {

    private int id;
    private String departmentName;
    private int noOfEmployees;
    List<Employee> listOfEmployees;
    private Date created;
    private Date modified;

    public Department(String departmentName, int noOfEmployees, List<Employee> listOfEmployees, Date created, Date modified) {
        this.departmentName = departmentName;
        this.noOfEmployees = noOfEmployees;
        this.listOfEmployees = listOfEmployees;
        this.created = created;
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (id != that.id) return false;
        if (noOfEmployees != that.noOfEmployees) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        if (listOfEmployees != null ? !listOfEmployees.equals(that.listOfEmployees) : that.listOfEmployees != null)
            return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        return modified != null ? modified.equals(that.modified) : that.modified == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
        result = 31 * result + noOfEmployees;
        result = 31 * result + (listOfEmployees != null ? listOfEmployees.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", noOfEmployees=" + noOfEmployees +
                ", listOfEmployees=" + listOfEmployees +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
