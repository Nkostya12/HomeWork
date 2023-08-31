package AbstractClasses.practice_1;

public class TopManager implements Employee {

    private static final double TOP_MANAGER_SALARY = 70_000D;

    private double incomeCompanyforSalary;



    public TopManager(Company company) {
        incomeCompanyforSalary = company.getIncome();

    }

    @Override
    public double getMonthSalary() {
        double salary;
        if (incomeCompanyforSalary >= 10_000_000) {
            salary = TOP_MANAGER_SALARY + TOP_MANAGER_SALARY * 1.5;
        } else {
            salary = TOP_MANAGER_SALARY;
        }
        return salary;
    }

    public String toString() {
        return "ТопМенеджер " + getMonthSalary() + System.lineSeparator();
    }

}
