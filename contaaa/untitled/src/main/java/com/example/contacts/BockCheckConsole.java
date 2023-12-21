package com.example.contacts;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BockCheckConsole {
    String er = "проверьте порядок ввода ";

    public boolean checkLine(String line) {




        String[] splitLine = line.trim().split(";");


        if (!line.replaceAll("[^;]", "").equals(";;") || !checkFIO(splitLine[0]) || !checkPhone(splitLine[1]) || !checkEmail(splitLine[2])) {
            System.out.println(er);
            return false;
        }
        return true;
    }

    private boolean checkFIO(String fio) {
        if (!fio.matches("[A-zА-я]+")) {
            er += "некоретный ввод фио";
            return false;
        }
        return true;
    }

    private boolean checkPhone(String phone) {
        if (!phone.matches("\\+?[0-9]+")) {
            er += "неккоректный номер";
            return false;
        }
        return true;
    }

    private boolean checkEmail(String email) {
        if (!email.matches("[A-Za-z0-9-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,6}$")) {
            er += "некорректный email";
            return false;
        }
        return true;
    }

    public boolean isEmail(String line) {
        return line.matches("[A-Za-z0-9-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,6}$");
    }

}
