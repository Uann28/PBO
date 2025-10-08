public class Manager extends Employee{
    int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    @Override
    public int calculateBonus() {
        int salaryAkhir = salary + bonus;
        return salaryAkhir;
    }

    public void getInfo() {
        System.out.println("nama : " + name);
        System.out.println("salary : " + salary);
        System.out.println("salary akhir: " + calculateBonus());
    }

    
}
