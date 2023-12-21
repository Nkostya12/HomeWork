package com.example.contacts.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter

@Component
public class DataContacts {

    private List<Contact> contactList;

    public DataContacts() {
        contactList = new ArrayList<>();
    }
}
