package com.example.contacts.service;



import com.example.contacts.data.Contact;
import com.example.contacts.data.DataContacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class BookController {



    private DataContacts dataContacts;

    @Autowired
    public BookController(DataContacts dataContacts) {
        this.dataContacts = dataContacts;
    }

    public List<Contact> showAllContacts() {
        return dataContacts.getContactList();
    }

    public String addNewContact(String line) {
        String[] splitLine = line.split(";");
        return dataContacts.getContactList().add(new Contact(splitLine[0], splitLine[1], splitLine[2])) + " контакт создан";
    }

    public void deleteContact(String email) {
        dataContacts.getContactList().stream().filter(contact -> contact.getEmail().equals(email)).findAny().ifPresent(contactr -> {
            dataContacts.getContactList().remove(contactr);
            System.out.println(contactr.getName() + " удален");
        });
    }

    public void exportBook() {
        StringBuilder contactsToFile = new StringBuilder();
        dataContacts.getContactList().forEach(contact -> contactsToFile.append(contact));
        try {
            FileWriter fileWriter = new FileWriter("src/resources/filesAllbook/allContact.txt");
            fileWriter.write(contactsToFile.toString());
            fileWriter.flush();
            System.out.println("экспорт завершен");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void init(String pathInit) {
        if (pathInit != null) {
            try {
                List<String> files = Files.readAllLines(Path.of(pathInit));
                for (String line : files) {
                    String[] lineSeparator = line.split(";");
                    dataContacts.getContactList().add(new Contact(lineSeparator[0], lineSeparator[1], lineSeparator[2]));

                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
