package en.codegym.task.pro.task10.task1008;

/* 
Salary
*/

public class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary > this.salary ? salary : this.salary;
    }
}
