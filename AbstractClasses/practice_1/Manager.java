package AbstractClasses.practice_1;

public class Manager implements Employee {


    private double getIncomeForSalary;




    public Manager() {
        getIncomeForSalary = Math.random() * ((150_000 - 115_000) + 115_000);

    }

    private static final double MANAGER_SALARY = 50_000D;

    @Override
    public double getMonthSalary() {
        double salary;
        salary = MANAGER_SALARY + (getIncomeForSalary * 0.05);
        return salary;
    }

    @Override
    public String toString() {
        return "Менеджер " + getMonthSalary() + System.lineSeparator();
    }
}
