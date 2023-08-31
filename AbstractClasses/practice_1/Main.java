package AbstractClasses.practice_1;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
        Company company = new Company(10000000);

        ArrayList<Employee> operatorList = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            operatorList.add(new Operator());
        }
        ArrayList<Employee> managerList = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            managerList.add(new Manager());
        }
        ArrayList<Employee> topManagerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            topManagerList.add(new TopManager(company));
        }

        company.hireAll(operatorList);
        company.hireAll(managerList);
        company.hireAll(topManagerList);


        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));

        System.out.println(company.getSizeEmployee());

        Iterator <Employee> iterator = company.getListEmployee().iterator();
        int count = 0;
        int size = company.getSizeEmployee()/2;

        while (iterator.hasNext() && count < size ){
            company.fire(company.getListEmployee().get(count));
            count++;
        }


        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));

        System.out.println(company.getSizeEmployee());


    }
}