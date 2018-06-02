package com.allometry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "comment")
public class Comment {
    @Id
    private String id;
    private String comment;
    private Date comment_date;
    private String user_id;
    private String question_id;
    private User user;



    public Comment(String commnet, Date comment_date, String user_id, String question_id) {
        this.comment = commnet;
        this.comment_date = comment_date;
        this.user_id = user_id;
        this.question_id = question_id;
    }

    public Comment() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (id != null ? !id.equals(comment.id) : comment.id != null) return false;
        if (comment != null ? !comment.equals(comment.comment) : comment.comment != null) return false;
        if (comment_date != null ? !comment_date.equals(comment.comment_date) : comment.comment_date != null)
            return false;
        if (user_id != null ? !user_id.equals(comment.user_id) : comment.user_id != null) return false;
        return question_id != null ? question_id.equals(comment.question_id) : comment.question_id == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (comment_date != null ? comment_date.hashCode() : 0);
        result = 31 * result + (user_id != null ? user_id.hashCode() : 0);
        result = 31 * result + (question_id != null ? question_id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", commnet='" + comment + '\'' +
                ", comment_date=" + comment_date +
                ", user_id='" + user_id + '\'' +
                ", question_id='" + question_id + '\'' +
                '}';
    }
}
