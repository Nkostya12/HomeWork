package com.example.contacts.initModule;

import com.example.contacts.service.ComandRun;

public class DefInit implements RunInterface {

    private ComandRun comandRun;


    @Override
    public void init() {

        System.out.println("Список контактов пуст" +System.lineSeparator());


    }
}
