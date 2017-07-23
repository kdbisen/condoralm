package com.allometry.org.model;

import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */
public class Project {

    private int id;
    private String projectName;
    private Date startDate;
    private int noOfResources;
    List<Employee> resources;
    private Date created;
    private Date modified;
    private Client client;


    public Project(String projectName, Date startDate, int noOfResources, List<Employee> resources, Date created, Date modified, Client client) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.noOfResources = noOfResources;
        this.resources = resources;
        this.created = created;
        this.modified = modified;
        this.client = client;
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

    public int getNoOfResources() {
        return noOfResources;
    }

    public void setNoOfResources(int noOfResources) {
        this.noOfResources = noOfResources;
    }

    public List<Employee> getResources() {
        return resources;
    }

    public void setResources(List<Employee> resources) {
        this.resources = resources;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (id != project.id) return false;
        if (noOfResources != project.noOfResources) return false;
        if (projectName != null ? !projectName.equals(project.projectName) : project.projectName != null) return false;
        if (startDate != null ? !startDate.equals(project.startDate) : project.startDate != null) return false;
        if (resources != null ? !resources.equals(project.resources) : project.resources != null) return false;
        if (created != null ? !created.equals(project.created) : project.created != null) return false;
        if (modified != null ? !modified.equals(project.modified) : project.modified != null) return false;
        return client != null ? client.equals(project.client) : project.client == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + noOfResources;
        result = 31 * result + (resources != null ? resources.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", noOfResources=" + noOfResources +
                ", resources=" + resources +
                ", created=" + created +
                ", modified=" + modified +
                ", client=" + client +
                '}';
    }
}
