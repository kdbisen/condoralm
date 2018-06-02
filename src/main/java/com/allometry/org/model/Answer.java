package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "answer")
public class Answer {

    @Id
    private String id;
    private String que_id;
    private String answer_details;
    private String user_id;
    private User user;
    private Date created;
    private Date modified;
    private int vote_up;
    private int vote_down;
    private boolean right;

    public Answer() {
    }

    public Answer(String que_id, String answer_details, String user_id) {
        this.que_id= que_id;
        this.answer_details = answer_details;
        this.user_id = user_id;
    }

    public Answer(String id, String que_id, String answer_details, String user_id, User user, Date created, Date modified, int vote_up, int vote_down, boolean right) {
        this.id = id;
        this.que_id = que_id;
        this.answer_details = answer_details;
        this.user_id = user_id;
        this.user = user;
        this.created = created;
        this.modified = modified;
        this.vote_up = vote_up;
        this.vote_down = vote_down;
        this.right = right;
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

    public String getAnswer_details() {
        return answer_details;
    }

    public void setAnswer_details(String answer_details) {
        this.answer_details = answer_details;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public int getVote_up() {
        return vote_up;
    }

    public void setVote_up(int vote_up) {
        this.vote_up = vote_up;
    }

    public int getVote_down() {
        return vote_down;
    }

    public void setVote_down(int vote_down) {
        this.vote_down = vote_down;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }
}
