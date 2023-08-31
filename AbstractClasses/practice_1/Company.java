package AbstractClasses.practice_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {

    private double incomeCompany;
    private ArrayList<Employee> employees;



    public Company(double incomeCompany) {
        this.incomeCompany = incomeCompany;
        employees = new ArrayList<>();
    }

    public int getSizeEmployee(){
        return this.employees.size();
    }

    public List<Employee> getListEmployee(){
        return this.employees;
    }



    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employes) {
        employees.addAll(employes);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public double getIncome() {
        return incomeCompany;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> topOrLowerSalaryStaff = new ArrayList<>();
        if (count <= 0 || count > employees.size()) {
            System.out.println("Icorrect count");
        } else {
            Collections.sort(employees);
            Collections.reverse(employees);
            for (int i = 0; i <= count; i++) {
                topOrLowerSalaryStaff.add(employees.get(i));
            }

        }
        return topOrLowerSalaryStaff;
    }


    public List<Employee> getLowestSalaryStaff(int count) {
        ArrayList<Employee> topOrLowerSalaryStaff = new ArrayList<>();
        if (count <= 0 || count > employees.size()) {
            System.out.println("Icorrect count");
        } else {
            Collections.sort(employees);

            for (int i = 0; i <= count; i++) {
                topOrLowerSalaryStaff.add(employees.get(i));
            }

        }
        return topOrLowerSalaryStaff;
    }

}