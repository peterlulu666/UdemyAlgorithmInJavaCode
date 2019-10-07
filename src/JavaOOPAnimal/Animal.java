package JavaOOPAnimal;

public class Animal {
    private int age;
    private String gender;
    private int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("Eating ");
    }

    public void sleep() {
        System.out.println("Sleeping ");

    }
}
