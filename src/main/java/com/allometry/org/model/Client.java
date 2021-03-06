package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */
@Document(collection = "client")
public class Client {

    @Id
    private String id;

    @Field(value = "client_name")
    private String clientName;
    private String location;
    private Domain domain;

    private Date created;
    private Date modified;

    public Client(String clientName, String location, Domain domain,   Date created, Date modified) {
        this.clientName = clientName;
        this.location = location;
        this.domain = domain;

        this.created = created;
        this.modified = modified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
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

        Client client = (Client) o;

        if (id != client.id) return false;
        if (clientName != null ? !clientName.equals(client.clientName) : client.clientName != null) return false;
        if (location != null ? !location.equals(client.location) : client.location != null) return false;
        if (domain != null ? !domain.equals(client.domain) : client.domain != null) return false;

        if (created != null ? !created.equals(client.created) : client.created != null) return false;
        return modified != null ? modified.equals(client.modified) : client.modified == null;
    }

    public Client( ) {

    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", location='" + location + '\'' +
                ", domain=" + domain +

                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
