package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */
@Document(collection = "project")
public class Project {

    @Id
    private String id;
    private String projectName;
    private Date startDate;
    private int noOfResources;
    private Date created;
    private Date modified;
    private Client client;


    public Project(String projectName, Date startDate, int noOfResources,   Date created, Date modified, Client client) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.noOfResources = noOfResources;

        this.created = created;
        this.modified = modified;
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

        if (created != null ? !created.equals(project.created) : project.created != null) return false;
        if (modified != null ? !modified.equals(project.modified) : project.modified != null) return false;
        return client != null ? client.equals(project.client) : project.client == null;
    }



    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", noOfResources=" + noOfResources +

                ", created=" + created +
                ", modified=" + modified +
                ", client=" + client +
                '}';
    }
}
