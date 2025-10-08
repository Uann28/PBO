public class mainAbstrak {
    
    public static void main(String[] args) {
        Manager m = new Manager("Juan", 5000000, 1000000);
        
        Staff s = new Staff("Madani", 500000, 100000);

        m.getInfo();
        s.getInfo();
    }
}
