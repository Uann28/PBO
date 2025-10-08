
public class dog  extends Animal{
    String breed;

    public dog(){
    }
    
    public dog(String name, int age, String breed) {
        super(age, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("guk guk guk.......");
    }

    @Override
    public String getInfo() {
        return "name : " + getName() + "\nage : " + getAge() + "\nbreed : " + breed;
    }
}
