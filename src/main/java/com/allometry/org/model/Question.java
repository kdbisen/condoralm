package com.allometry.org.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "question")
public class Question {

    @Id
    private String id;
    private String tital;
    private String details;
    private List<String> technologies;
    private List<String> projects;
    private List<String> persons;
    private Date created;
    private Date modified;
    private String userId;
    private String askedBy;
    private String priority;




    public String getAskedBy() {
        return askedBy;
    }

    public void setAskedBy(String askedBy) {
        this.askedBy = askedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (id != null ? !id.equals(question.id) : question.id != null) return false;
        if (tital != null ? !tital.equals(question.tital) : question.tital != null) return false;
        if (details != null ? !details.equals(question.details) : question.details != null) return false;
        if (technologies != null ? !technologies.equals(question.technologies) : question.technologies != null)
            return false;
        if (projects != null ? !projects.equals(question.projects) : question.projects != null) return false;
        if (persons != null ? !persons.equals(question.persons) : question.persons != null) return false;
        if (created != null ? !created.equals(question.created) : question.created != null) return false;
        if (modified != null ? !modified.equals(question.modified) : question.modified != null) return false;
        return userId != null ? userId.equals(question.userId) : question.userId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tital != null ? tital.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (technologies != null ? technologies.hashCode() : 0);
        result = 31 * result + (projects != null ? projects.hashCode() : 0);
        result = 31 * result + (persons != null ? persons.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", tital='" + tital + '\'' +
                ", details='" + details + '\'' +
                ", technologies=" + technologies +
                ", projects=" + projects +
                ", persons=" + persons +
                ", created=" + created +
                ", modified=" + modified +
                ", userId='" + userId + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Question(String tital, String details, List<String> technologies, List<String> projects, List<String> persons, Date created, Date modified, String userId, String priority) {
        this.tital = tital;
        this.details = details;
        this.technologies = technologies;
        this.projects = projects;
        this.persons = persons;
        this.created = created;
        this.modified = modified;
        this.userId = userId;
        this.priority = priority;
    }

    public Question(String id, String tital, String details, List<String> technologies, List<String> projects, List<String> persons, Date created, Date modified,  String priority) {
        this.id = id;
        this.tital = tital;
        this.details = details;
        this.technologies = technologies;
        this.projects = projects;
        this.persons = persons;
        this.created = created;
        this.modified = modified;
        this.priority = priority;
    }
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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

    public Question() {
    }

    public Question(String tital, String details, List<String> technologies, List<String> projects, List<String> persons) {
        this.tital = tital;
        this.details = details;
        this.technologies = technologies;
        this.projects = projects;
        this.persons = persons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public List<String> getPersons() {
        return persons;
    }

    public void setPersons(List<String> persons) {
        this.persons = persons;
    }

}

