package com.vti.entity.Exercise6.Question1;

public class Contact {
    protected String name;
    protected String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Contact [name=" + name + ", phone=" + phone + "]";
    }
}
