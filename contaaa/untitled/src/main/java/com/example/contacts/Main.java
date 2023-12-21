package com.example.contacts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BookController controller = context.getBean(BookController.class);
        BockCheckConsole checker = context.getBean(BockCheckConsole.class);

        System.out.println("добро пожаловать введите команду или help");

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
