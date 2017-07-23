package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */

@Document
public class Team {
    @Id
    private int id;
    private String teamName;
    private int managerId;
    private Date created;
    private Date modified;


    public Team(String teamName, int managerId, Date created, Date modified) {
        this.teamName = teamName;
        this.managerId = managerId;
        this.created = created;
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
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

        Team team = (Team) o;

        if (id != team.id) return false;
        if (managerId != team.managerId) return false;
        if (teamName != null ? !teamName.equals(team.teamName) : team.teamName != null) return false;
        if (created != null ? !created.equals(team.created) : team.created != null) return false;
        return modified != null ? modified.equals(team.modified) : team.modified == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
        result = 31 * result + managerId;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", managerId=" + managerId +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
