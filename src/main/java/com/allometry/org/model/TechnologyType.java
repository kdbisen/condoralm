package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */

@Document(collection = "technologyType")
public class TechnologyType {

    @Id
    private int id;
    private  String type;
    private Date created;
    private Date modified;

    public TechnologyType(String type, Date created, Date modified) {
        this.type = type;
        this.created = created;
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TechnologyType that = (TechnologyType) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        return modified != null ? modified.equals(that.modified) : that.modified == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        return result;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "TechnologyType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
