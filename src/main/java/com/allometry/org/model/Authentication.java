package com.allometry.org.model;

public class Authentication {

    boolean validUser = false;
    User user;

    public Authentication(boolean validUser, User user) {
        this.validUser = validUser;
        this.user = user;
    }

    public boolean isValidUser() {
        return validUser;
    }

    public void setValidUser(boolean validUser) {
        this.validUser = validUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
