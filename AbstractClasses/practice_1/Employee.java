package AbstractClasses.practice_1;

public interface Employee extends Comparable <Employee>{


   double getMonthSalary();
   @Override
   default int compareTo(Employee o){

        return Double.compare(this.getMonthSalary(),o.getMonthSalary());

    }
}
