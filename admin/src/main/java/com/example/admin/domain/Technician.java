package com.example.admin.domain;

public class Technician {
    private String technician_id;
    private String realname;
    private String nickname;
    private String phone_no;
    private String qq_no;

    public String getTechnician_id() {
        return technician_id;
    }

    @Override
    public String toString() {
        return "Technician{" +
                "technician_id='" + technician_id + '\'' +
                ", realname='" + realname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", qq_no='" + qq_no + '\'' +
                '}';
    }

    public void setTechnician_id(String technician_id) {
        this.technician_id = technician_id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
}
