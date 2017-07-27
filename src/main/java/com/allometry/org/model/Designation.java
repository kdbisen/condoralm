package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */
@Document(collection = "designation")
public class Designation {

    @Id
    private String id;
    private String designation;
    private String specializedFor;
    private Date created;
    private Date modified;

    public Designation(String designation, String specializedFor, Date created, Date modified) {
        this.designation = designation;
        this.specializedFor = specializedFor;
        this.created = created;
        this.modified = modified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSpecializedFor() {
        return specializedFor;
    }

    public void setSpecializedFor(String specializedFor) {
        this.specializedFor = specializedFor;
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

        Designation that = (Designation) o;

        if (id != that.id) return false;
        if (designation != null ? !designation.equals(that.designation) : that.designation != null) return false;
        if (specializedFor != null ? !specializedFor.equals(that.specializedFor) : that.specializedFor != null)
            return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        return modified != null ? modified.equals(that.modified) : that.modified == null;
    }



    @Override
    public String toString() {
        return "Designation{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", specializedFor='" + specializedFor + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
