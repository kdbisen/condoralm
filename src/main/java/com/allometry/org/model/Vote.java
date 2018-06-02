package com.allometry.org.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vote")
public class Vote {
    @Id
    private String id;
    private String que_id;
    private String user_id;
    private boolean vote_up;
    private boolean vote_down;


    public Vote(String id, String que_id, String user_id, boolean vote_up, boolean vote_down) {
        this.id = id;
        this.que_id = que_id;
        this.user_id = user_id;
        this.vote_up = vote_up;
        this.vote_down = vote_down;
    }

    public Vote() {
    }

    public Vote(String que_id, String user_id, boolean vote_up, boolean vote_down) {
        this.que_id = que_id;
        this.user_id = user_id;
        this.vote_up = vote_up;
        this.vote_down = vote_down;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQue_id() {
        return que_id;
    }

    public void setQue_id(String que_id) {
        this.que_id = que_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public boolean isVote_up() {
        return vote_up;
    }

    public void setVote_up(boolean vote_up) {
        this.vote_up = vote_up;
    }

    public boolean isVote_down() {
        return vote_down;
    }

    public void setVote_down(boolean vote_down) {
        this.vote_down = vote_down;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vote vote = (Vote) o;

        if (vote_up != vote.vote_up) return false;
        if (vote_down != vote.vote_down) return false;
        if (id != null ? !id.equals(vote.id) : vote.id != null) return false;
        if (que_id != null ? !que_id.equals(vote.que_id) : vote.que_id != null) return false;
        return user_id != null ? user_id.equals(vote.user_id) : vote.user_id == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (que_id != null ? que_id.hashCode() : 0);
        result = 31 * result + (user_id != null ? user_id.hashCode() : 0);
        result = 31 * result + (vote_up ? 1 : 0);
        result = 31 * result + (vote_down ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id='" + id + '\'' +
                ", que_id='" + que_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", vote_up=" + vote_up +
                ", vote_down=" + vote_down +
                '}';
    }
}
