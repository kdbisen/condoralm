package com.allometry.org.model;

import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */
public class Technology {

    private int id;
    private String technologyName;
    private  String Type;
    private Date created;
    private Date modified;
    private List<Employee> listOfEmployee;


    public Technology(String technologyName, String type, Date created, Date modified, List<Employee> listOfEmployee) {
        this.technologyName = technologyName;
        Type = type;
        this.created = created;
        this.modified = modified;
        this.listOfEmployee = listOfEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
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

        Technology that = (Technology) o;

        if (id != that.id) return false;
        if (technologyName != null ? !technologyName.equals(that.technologyName) : that.technologyName != null)
            return false;
        if (Type != null ? !Type.equals(that.Type) : that.Type != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (modified != null ? !modified.equals(that.modified) : that.modified != null) return false;
        return listOfEmployee != null ? listOfEmployee.equals(that.listOfEmployee) : that.listOfEmployee == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (technologyName != null ? technologyName.hashCode() : 0);
        result = 31 * result + (Type != null ? Type.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + (listOfEmployee != null ? listOfEmployee.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "id=" + id +
                ", technologyName='" + technologyName + '\'' +
                ", Type='" + Type + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", listOfEmployee=" + listOfEmployee +
                '}';
    }
}
