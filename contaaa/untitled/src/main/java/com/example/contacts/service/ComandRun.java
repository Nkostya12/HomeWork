package com.example.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ComandRun {

//            BookController controller = context.getBean(BookController.class);
//        BockCheckConsole checker = context.getBean(BockCheckConsole.class);

    private BookController controller;
    private BockCheckConsole checker;

    @Autowired
    public ComandRun(BookController controller, BockCheckConsole checker) {
        this.controller = controller;
        this.checker = checker;

    }

    public void consoveActive() {

        System.out.println("добро пожаловать введите команду или help");

        controller.init();


        for (; ; ) {

            Scanner console = new Scanner(System.in);


            String line = console.nextLine();

            switch (line) {

                case ("help"):
                    System.out.println("формат данный для добавление контакта фио;номер;email" + System.lineSeparator() +
                            "для удаление записи введите email указаный при создании" + System.lineSeparator() +
                            "для отображение всех контактов show" + System.lineSeparator() +
                            "для экспорта в файл export" + System.lineSeparator() +
                            "для завершения работы ex"
                    );
                    break;

                case ("show"):
                    System.out.println("список контактов" + System.lineSeparator() + controller.showAllContacts());
                    break;
                case ("export"):
                    controller.exportBook();
                    break;
                case ("ex"):
                    return;

                default:
                    if (checker.isEmail(line)) {
                        controller.deleteContact(line);
                        break;
                    }

                    if (checker.checkLine(line)) {
                        System.out.println(controller.addNewContact(line));
                        break;
                    }

            }
        }

    }
}
