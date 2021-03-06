package com.example.whatsappclone.User;

public class UserObject {
    private String name;
    private String phone;
    private String uid;

    public UserObject(String uid, String name, String phone){
        this.uid = uid;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }
}
