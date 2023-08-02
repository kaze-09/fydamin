package com.example.admin.domain;

public class User {
    private String user_id;
    private String username;
    private String phone_no;
    private String qq_no;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getQq_no() {
        return qq_no;
    }

    public void setQq_no(String qq_no) {
        this.qq_no = qq_no;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", qq_no='" + qq_no + '\'' +
                '}';
    }
}