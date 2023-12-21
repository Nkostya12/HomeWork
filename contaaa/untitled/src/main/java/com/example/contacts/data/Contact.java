package com.example.contacts.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Contact {
    private String name;
    private String number;
    private String email;


    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ";" + number + ";" + email + ";" + System.lineSeparator();
    }
}
