package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/10/2017.
 */

@Document(collection = "employee")
public class Employee {
@Id
    private String id;
    private String firstName;
    private String lastName;
    private Department  department;
    private String empId;
    private Designation designation;
    private Role rolde;
    private int yearOfExperience;
    private Team team;
    private int currentProjectId;
    private List<Technology> techonologiesKnows;
    private List<Project> oldProjects;
    private Date dateOfJoining;
    private Date dob;
    private Date created;
    private Date modified;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, Department department, String empId, Designation designation, Role rolde, int yearOfExperience, Team team, int currentProjectId, List<Technology> techonologiesKnows, List<Project> oldProjects, Date dateOfJoining, Date dob, Date created, Date modified) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.empId = empId;
        this.designation = designation;
        this.rolde = rolde;
        this.yearOfExperience = yearOfExperience;
        this.team = team;
        this.currentProjectId = currentProjectId;
        this.techonologiesKnows = techonologiesKnows;
        this.oldProjects = oldProjects;
        this.dateOfJoining = dateOfJoining;
        this.dob = dob;
        this.created = created;
        this.modified = modified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Role getRolde() {
        return rolde;
    }

    public void setRolde(Role rolde) {
        this.rolde = rolde;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getCurrentProjectId() {
        return currentProjectId;
    }

    public void setCurrentProjectId(int currentProjectId) {
        this.currentProjectId = currentProjectId;
    }

    public List<Technology> getTechonologiesKnows() {
        return techonologiesKnows;
    }

    public void setTechonologiesKnows(List<Technology> techonologiesKnows) {
        this.techonologiesKnows = techonologiesKnows;
    }

    public List<Project> getOldProjects() {
        return oldProjects;
    }

    public void setOldProjects(List<Project> oldProjects) {
        this.oldProjects = oldProjects;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (yearOfExperience != employee.yearOfExperience) return false;
        if (currentProjectId != employee.currentProjectId) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        if (department != null ? !department.equals(employee.department) : employee.department != null) return false;
        if (empId != null ? !empId.equals(employee.empId) : employee.empId != null) return false;
        if (designation != null ? !designation.equals(employee.designation) : employee.designation != null)
            return false;
        if (rolde != null ? !rolde.equals(employee.rolde) : employee.rolde != null) return false;
        if (team != null ? !team.equals(employee.team) : employee.team != null) return false;
        if (techonologiesKnows != null ? !techonologiesKnows.equals(employee.techonologiesKnows) : employee.techonologiesKnows != null)
            return false;
        if (oldProjects != null ? !oldProjects.equals(employee.oldProjects) : employee.oldProjects != null)
            return false;
        if (dateOfJoining != null ? !dateOfJoining.equals(employee.dateOfJoining) : employee.dateOfJoining != null)
            return false;
        if (dob != null ? !dob.equals(employee.dob) : employee.dob != null) return false;
        if (created != null ? !created.equals(employee.created) : employee.created != null) return false;
        return modified != null ? modified.equals(employee.modified) : employee.modified == null;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", empId='" + empId + '\'' +
                ", designation=" + designation +
                ", rolde=" + rolde +
                ", yearOfExperience=" + yearOfExperience +
                ", team=" + team +
                ", currentProjectId=" + currentProjectId +
                ", techonologiesKnows=" + techonologiesKnows +
                ", oldProjects=" + oldProjects +
                ", dateOfJoining=" + dateOfJoining +
                ", dob=" + dob +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
