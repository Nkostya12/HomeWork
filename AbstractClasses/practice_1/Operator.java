package AbstractClasses.practice_1;

public class Operator implements Employee {

    private static final double OPETATOR_SALARY = 30_000D;




    @Override
    public double getMonthSalary() {
        return OPETATOR_SALARY;
    }

    @Override
    public String toString() {
        return  "Оператор " + OPETATOR_SALARY + System.lineSeparator();
    }
}
