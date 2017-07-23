package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.util.Date;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */
@Document(collection = "domain")

public class Domain {
    @Id
    private String id;
    private String domainName;
    private Date created;
    private Date modified;

    public Domain(String domainName, Date created, Date modified) {
        this.domainName = domainName;
        this.created = created;
        this.modified = modified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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

        Domain domain = (Domain) o;

        if (id != domain.id) return false;
        if (domainName != null ? !domainName.equals(domain.domainName) : domain.domainName != null) return false;
        if (created != null ? !created.equals(domain.created) : domain.created != null) return false;
        return modified != null ? modified.equals(domain.modified) : domain.modified == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "id=" + id +
                ", domainName='" + domainName + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
