package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */

@Document(collection = "role")
public class Role {
@Id
    private String id;

    private String roleName;
    private Date created;
    private Date modified;
    private List<Employee> listOfEmployee;

    public Role(String roleName, Date created, Date modified, List<Employee> listOfEmployee) {
        this.roleName = roleName;
        this.created = created;
        this.modified = modified;
        this.listOfEmployee = listOfEmployee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(List<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (id != role.id) return false;
        if (roleName != null ? !roleName.equals(role.roleName) : role.roleName != null) return false;
        if (created != null ? !created.equals(role.created) : role.created != null) return false;
        if (modified != null ? !modified.equals(role.modified) : role.modified != null) return false;
        return listOfEmployee != null ? listOfEmployee.equals(role.listOfEmployee) : role.listOfEmployee == null;
    }


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", listOfEmployee=" + listOfEmployee +
                '}';
    }
}
