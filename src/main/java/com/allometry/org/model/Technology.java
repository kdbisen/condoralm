package com.allometry.org.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */

@Document(collection = "technology")
public class Technology {

    private String id;
    @Field(value = "technology_name")
    private String technologyName;
    private  String type;
    private Date created;
    private Date modified;


    public Technology(String technologyName, String type, Date created, Date modified ) {
        this.technologyName = technologyName;
        this.type = type;
        this.created = created;
        this.modified = modified;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
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

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }


    public Technology() {

    }

    @Override
    public String toString() {
        return "Technology{" +
                "id=" + id +
                ", technologyName='" + technologyName + '\'' +
                ", Type='" + type + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
