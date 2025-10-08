public abstract class Employee {
    String name;
    int salary;
    public abstract int calculateBonus();

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String setName() {
        return name;
    }

    public int setSalary() {
        return salary;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getSalary(int salary) {
        this.salary = salary;
    }
}